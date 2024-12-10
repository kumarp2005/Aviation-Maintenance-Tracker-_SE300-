document.addEventListener('DOMContentLoaded', loadTickets);

async function loadTickets() {
    const tableBody = document.getElementById('tickets-list');
    
    try {
        const response = await fetch('/api/tickets');
        const tickets = await response.json();
        
        if (tickets.length === 0) {
            tableBody.innerHTML = '<tr><td colspan="6">No tickets found</td></tr>';
            return;
        }

        tableBody.innerHTML = tickets.map(ticket => `
            <tr>
                <td>${ticket.ticketNumber}</td>
                <td>${ticket.tailNumber}</td>
                <td>
                    <span class="status-indicator ${ticket.status ? 'status-open' : 'status-closed'}">
                        ${ticket.status ? 'Open' : 'Closed'}
                    </span>
                </td>
                <td>
                    <span class="status-indicator ${ticket.criticalStatus ? 'status-critical' : 'status-normal'}">
                        ${ticket.criticalStatus ? 'Yes' : 'No'}
                    </span>
                </td>
                <td>${ticket.problem}</td>
                <td>${ticket.description}</td>
            </tr>
        `).join('');
    } catch (error) {
        console.error('Error loading tickets:', error);
        tableBody.innerHTML = '<tr><td colspan="6">Error loading ticket data</td></tr>';
    }
}