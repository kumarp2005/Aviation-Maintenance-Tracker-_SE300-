document.addEventListener('DOMContentLoaded', loadOpenTickets);

async function loadOpenTickets() {
    const tableBody = document.getElementById('open-tickets-list');
    
    try {
        const response = await fetch('/api/tickets/open');
        const tickets = await response.json();
        
        if (tickets.length === 0) {
            tableBody.innerHTML = '<tr><td colspan="6">No open tickets found</td></tr>';
            return;
        }

        tableBody.innerHTML = tickets.map(ticket => `
            <tr>
                <td>${ticket.ticketNumber}</td>
                <td>${ticket.tailNumber}</td>
                <td>
                    <span class="status-indicator ${ticket.criticalStatus ? 'status-critical' : 'status-normal'}">
                        ${ticket.criticalStatus ? 'Yes' : 'No'}
                    </span>
                </td>
                <td>${ticket.problem}</td>
                <td>${ticket.description}</td>
                <td>
                    <button onclick="closeTicket(${ticket.ticketNumber})" class="action-button">
                        Close Ticket
                    </button>
                </td>
            </tr>
        `).join('');
    } catch (error) {
        console.error('Error loading open tickets:', error);
        tableBody.innerHTML = '<tr><td colspan="6">Error loading ticket data</td></tr>';
    }
}

async function closeTicket(ticketNumber) {
    if (!confirm('Are you sure you want to close this ticket?')) {
        return;
    }

    try {
        const response = await fetch(`/api/tickets/${ticketNumber}/close`, {
            method: 'POST'
        });

        if (response.ok) {
            alert('Ticket closed successfully');
            loadOpenTickets(); // Reload the list
        } else {
            alert('Error closing ticket');
        }
    } catch (error) {
        console.error('Error closing ticket:', error);
        alert('Error closing ticket');
    }
}