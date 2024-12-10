document.addEventListener('DOMContentLoaded', initialize);

async function initialize() {
    await loadAircraft();
    setupFormSubmission();
}

async function loadAircraft() {
    const select = document.getElementById('tail-number');
    
    try {
        const response = await fetch('/api/aircraft');
        const aircraft = await response.json();
        
        if (aircraft.length === 0) {
            select.innerHTML = '<option value="">No aircraft available</option>';
            return;
        }

        select.innerHTML = `
            <option value="">Select an aircraft</option>
            ${aircraft.map(plane => `
                <option value="${plane.tailNumber}">
                    ${plane.tailNumber} - ${plane.model}
                </option>
            `).join('')}
        `;
    } catch (error) {
        console.error('Error loading aircraft:', error);
        select.innerHTML = '<option value="">Error loading aircraft</option>';
    }
}

function setupFormSubmission() {
    const form = document.getElementById('ticket-form');
    
    form.addEventListener('submit', async (e) => {
        e.preventDefault();
        
        const newTicket = {
            tailNumber: document.getElementById('tail-number').value,
            critical: document.getElementById('critical').checked,
            problem: document.getElementById('part').value,
            description: document.getElementById('description').value
        };

        try {
            const response = await fetch('/api/tickets', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(newTicket)
            });

            if (response.ok) {
                alert('Ticket created successfully!');
                form.reset();
                window.location.href = '/open-tickets.html';
            } else {
                throw new Error('Error creating ticket');
            }
        } catch (error) {
            console.error('Error:', error);
            alert('Error creating ticket: ' + error.message);
        }
    });
}