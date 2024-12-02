import java.util.*;

public class plane {
    private ArrayList<ticket> tickets;
    private String model;
    private String tailNumber;
    private double flightHours;

    public plane() {
        tickets = new ArrayList<>();
        flightHours = 0;
    }

    public void addTicket(ticket tck) {
        tickets.add(tck);
    }

    public void editModel(String newModel) {
        model = newModel;
    }

    public void addFlightHours(double newHours) {
        flightHours = flightHours + newHours;
    }

    public void editTailNumber(String newTail) {
        tailNumber = newTail;
    }

    public ArrayList<ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public double getFlightHours() {
        return flightHours;
    }

    public String getModel() {
        return model;
    }

    public ArrayList<ticket> getOpenTickets() {
        ArrayList<ticket> openTickets = new ArrayList<>();
        for (ticket t : tickets) {
            if (t.getStatus()) {
                openTickets.add(t);
            }
        }
        return openTickets;
    }
}