import java.util.*;
public class plane {

private ArrayList<ticket> tickets = new ArrayList<ticket>();
private String model;
private String tailNumber;
private double flightHours;
private ArrayList<String> parts = new ArrayList<String>();

public void addTicket(ticket tck){
    tickets.add(tck);
}

public void editModel(String newModel){
    model = newModel;
}

public void addPart(String newPart){
    parts.add(newPart);
}

public void addFlightHours(double newHours){
    flightHours = flightHours + newHours;
}

public void editTailNumber(String newTail){
    tailNumber = newTail;
}

public ArrayList<ticket> getTickets(){
    ArrayList<ticket> tks = tickets;

    return tks;
}

public String getTailNumber(){
    String tailNum = tailNumber;
    return tailNum;
}

public double getFlightHours(){
    double hours = flightHours;
    return hours;
}

public ArrayList<String> getParts(){
    ArrayList<String> allParts = parts;
    return allParts;
}


}



