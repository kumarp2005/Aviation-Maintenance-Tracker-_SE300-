package com.maintenance.model;

public class ticket {
    private boolean resolveStatus; // true = open, false = closed
    private double ticketNumber;
    private boolean criticalStatus;
    private String tailNumber;
    private String problem;
    private String description;

    // Constructor
    public ticket() {
        resolveStatus = true; // New tickets are open by default
    }

    // Set ticket status (open/closed)
    public void updateStatus(boolean status) {
        resolveStatus = status;
    }

    // Set ticket number
    public void setTicketNumber(double num) {
        ticketNumber = num;
    }

    // Set critical status
    public void criticalStatus(boolean isCritical) {
        criticalStatus = isCritical;
    }

    // Set tail number
    public void setTailNumber(String tail) {
        tailNumber = tail;
    }

    // Set problem description
    public void addProblem(String planeProblem) {
        problem = planeProblem;
    }

    // Set detailed description
    public void addDescription(String problemDescription) {
        description = problemDescription;
    }

    // Get ticket status
    public boolean getStatus() {
        return resolveStatus;
    }

    // Get ticket number
    public double getTicketNumber() {
        return ticketNumber;
    }

    // Get critical status
    public boolean getCriticalStatus() {
        return criticalStatus;
    }

    // Get tail number
    public String getTailNumber() {
        return tailNumber;
    }

    // Get problem description
    public String getProblem() {
        return problem;
    }

    // Get detailed description
    public String getDescription() {
        return description;
    }
}