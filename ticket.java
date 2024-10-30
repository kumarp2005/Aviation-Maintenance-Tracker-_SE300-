
public class ticket {

    private boolean resolveStatus;
    private double ticketNumber;
    private boolean criticalStatus;
    private double date;
    private String tailNumber;
    private String problem;
    private String description;

    public void updateStatus(boolean status){
        resolveStatus = status;
    } 

    public void setTicketNumber(double num){
        ticketNumber = num;
    }

    public void criticalStatus(boolean isCritical){
        criticalStatus = isCritical;
    }

    public void setDate(double newDate){
        date = newDate;
    }

    public void setTailNumber(String tail){
        tailNumber = tail;
    }

    public void addProblem(String planeProblem){
        problem = planeProblem;
    }

    public void addDescription(String problemDescription){
        description = problemDescription;
    }

    public boolean getStatus(){
        boolean status = resolveStatus;
        return status;
    }

    public double getTicketNumber(){
        double tickNum = ticketNumber;
        return tickNum;
    }

    public boolean getCriticalStatus(){
        boolean isCritical = criticalStatus;
        return isCritical;
    }
    
    public double getDate(){
        double getDate = date;
        return getDate;
    }

    public String getTailNumber(){
        String tail = tailNumber;
        return tail;
    }

    public String getProblem(){
        String getProblem = problem;
        return problem;
    }

    public String getDescription(){
        String descript = description;
        return descript;
    }
}
