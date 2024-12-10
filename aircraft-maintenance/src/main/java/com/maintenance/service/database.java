package com.maintenance.service;

import com.maintenance.model.*;
import java.util.*;

public class database {
    private ArrayList<plane> fleet;
    private ArrayList<ticket> allTickets;

    // Constructor - initializes the database and loads initial data
    public database() {
        fleet = new ArrayList<>();
        allTickets = new ArrayList<>();
        loadInitialData();
    }

    // Load sample data
    private void loadInitialData() {
        // Adding sample aircraft and tickets
        addPlaneAndTicket("N101ER", "Cessna 172 Skyhawk", 745, 1, "Engine", true, "Engine blew up from a fuel leak",
                false);
        addPlaneAndTicket("N102ER", "Cessna 172 Skyhawk", 683, 3, "Propeller", true, "Cracked on all sides", false);
        // Add more entries as needed
    }

    // Helper method to add a plane and its ticket
    private void addPlaneAndTicket(String tailNumber, String model, double hours,
            double ticketNum, String part, boolean isCritical,
            String description, boolean isOpen) {
        // Create or find plane
        plane currentPlane = searchByTail(tailNumber);
        if (currentPlane == null) {
            currentPlane = new plane();
            currentPlane.editTailNumber(tailNumber);
            currentPlane.editModel(model);
            currentPlane.addFlightHours(hours);
            fleet.add(currentPlane);
        }

        // Create ticket
        ticket newTicket = new ticket();
        newTicket.setTicketNumber(ticketNum);
        newTicket.setTailNumber(tailNumber);
        newTicket.addProblem(part);
        newTicket.criticalStatus(isCritical);
        newTicket.addDescription(description);
        newTicket.updateStatus(isOpen);

        currentPlane.addTicket(newTicket);
        allTickets.add(newTicket);
    }

    // Add a new plane to the fleet
    public void addPlane(plane pl) {
        fleet.add(pl);
    }

    // Get all planes in the fleet
    public ArrayList<plane> returnFleet() {
        return fleet;
    }

    // Search for a plane by tail number
    public plane searchByTail(String tailNum) {
        for (plane p : fleet) {
            if (p.getTailNumber().equalsIgnoreCase(tailNum)) {
                return p;
            }
        }
        return null;
    }

    // Get all tickets in the system
    public ArrayList<ticket> getAllTickets() {
        return allTickets;
    }

    // Get only open tickets
    public ArrayList<ticket> openTickets() {
        ArrayList<ticket> openTk = new ArrayList<>();
        for (ticket t : allTickets) {
            if (t.getStatus()) {
                openTk.add(t);
            }
        }
        return openTk;
    }

    // Get the next available ticket number
    public double getNextTicketNumber() {
        double maxTicket = 0;
        for (ticket t : allTickets) {
            if (t.getTicketNumber() > maxTicket) {
                maxTicket = t.getTicketNumber();
            }
        }
        return maxTicket + 1;
    }

    // Add a new ticket to the system
    public void addNewTicket(ticket tk) {
        allTickets.add(tk);
        plane aircraft = searchByTail(tk.getTailNumber());
        if (aircraft != null) {
            aircraft.addTicket(tk);
        }
    }
}