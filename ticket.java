public class ticket {
    private boolean resolveStatus;
    private double ticketNumber;
    private boolean criticalStatus;
    private String tailNumber;
    private String problem;
    private String description;

    public ticket() {
        resolveStatus = true; // New tickets are open by default
    }

    public void updateStatus(boolean status) {
        resolveStatus = status;
    }

    public void setTicketNumber(double num) {
        ticketNumber = num;
    }

    public void criticalStatus(boolean isCritical) {
        criticalStatus = isCritical;
    }

    public void setTailNumber(String tail) {
        tailNumber = tail;
    }

    public void addProblem(String planeProblem) {
        problem = planeProblem;
    }

    public void addDescription(String problemDescription) {
        description = problemDescription;
    }

    public boolean getStatus() {
        return resolveStatus;
    }

    public double getTicketNumber() {
        return ticketNumber;
    }

    public boolean getCriticalStatus() {
        return criticalStatus;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public String getProblem() {
        return problem;
    }

    public String getDescription() {
        return description;
    }
}