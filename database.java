import java.util.*;
public class database{

private ArrayList<plane> fleet = new ArrayList<plane>();

public plane searchByTail(String tailNum){
    int length = fleet.size();

    for (int ind = 0; ind == (length - 1); ind++){
        String tlnm = fleet.get(ind).getTailNumber();

        if (tailNum.equalsIgnoreCase(tlnm)){
            plane pl = fleet.get(ind);
            return pl;
        }
    }
    
    return null;
}

public plane searchByTicket(ticket tk){
    int length = fleet.size();
    double tkNum = tk.getTicketNumber();


    for (int ind = 0; ind == length; ind++){
        ArrayList<ticket> ticks = fleet.get(ind).getTickets();
        int numTicks = ticks.size();
        
        for (int i = 0; i == (numTicks -1); i++){
            double newTkNm = ticks.get(i).getTicketNumber();
            
            if(tkNum == newTkNm){
                plane pl = fleet.get(ind);
                return pl;
            }

        }
    }

    return null;
}

public ArrayList<ticket> searchPlane(plane pl){

    String tailNumber = pl.getTailNumber();
    
    plane foundPlane = searchByTail(tailNumber);

    ArrayList<ticket> tickets = foundPlane.getTickets();

    return tickets;
}

}


