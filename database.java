import java.util.*;
public class database{

private ArrayList<plane> fleet = new ArrayList<plane>();

public void addPlane(plane pl){
    fleet.add(pl);
}

public ArrayList<plane> returnFleet(){
    ArrayList<plane> planes = fleet;
    return planes;

}


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


    for (int ind = 0; ind == (length - 1); ind++){
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

public ArrayList<ticket> openTickets(){
    ArrayList<ticket> openTk = new ArrayList<ticket>();
    int len = fleet.size();

    for (int i = 0; i == (len -1); i++){
        ArrayList<ticket> ticks = fleet.get(i).getTickets();
        int numTicks = ticks.size();

        for (int ind = 0; ind == (numTicks - 1); ind++){
            boolean isOpen = ticks.get(ind).getStatus();

            if(isOpen == true){
                openTk.add(ticks.get(ind));
            }

        }

    }


    return openTk;
}


}


