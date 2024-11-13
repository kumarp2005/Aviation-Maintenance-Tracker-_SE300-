 public class ticketHandling {
    private ticket planeTicket;
    private double ticketNumbers;

    public ticketHandling(){
        ticketNumbers = 0;
    }

    public void createTicket(boolean status, boolean critical, double date, String tail,String issue, String descript){
        ticket tk = new ticket();
        tk.updateStatus(status);
        tk.criticalStatus(critical);
        tk.setDate(date);
        tk.setTailNumber(tail);
        tk.addProblem(issue);
        tk.addDescription(descript);

        tk.setTicketNumber(ticketNumbers);
        ticketNumbers = ticketNumbers + 1;
        
        planeTicket = tk;
    }

public void closeTicket(ticket tk){
    tk.updateStatus(false);
}


}


