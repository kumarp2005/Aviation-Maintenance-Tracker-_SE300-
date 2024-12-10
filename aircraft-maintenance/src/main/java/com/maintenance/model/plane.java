package com.maintenance.model;

import java.util.ArrayList;

public class plane {
    private ArrayList<ticket> tickets;
    private String model;
    private String tailNumber;
    private double flightHours;

    // Constructor
    public plane() {
        tickets = new ArrayList<ticket>();
    }

    // Add a new ticket to this plane
    public void addTicket(ticket tck) {
        tickets.add(tck);
    }

    // Set/update the model of the plane
    public void editModel(String newModel) {
        model = newModel;
    }

    // Add flight hours to the plane
    public void addFlightHours(double newHours) {
        flightHours = newHours;
    }

    // Set/update the tail number
    public void editTailNumber(String newTail) {
        tailNumber = newTail;
    }

    // Get all tickets for this plane
    public ArrayList<ticket> getTickets() {
        return tickets;
    }

    // Get the tail number
    public String getTailNumber() {
        return tailNumber;
    }

    // Get total flight hours
    public double getFlightHours() {
        return flightHours;
    }

    // Get the model name
    public String getModel() {
        return model;
    }

    // Get only open tickets for this plane
    public ArrayList<ticket> getOpenTickets() {
        ArrayList<ticket> openTickets = new ArrayList<ticket>();
        for (ticket t : tickets) {
            if (t.getStatus()) {
                openTickets.add(t);
            }
        }
        return openTickets;
    }
}