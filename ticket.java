
public class ticket {

    private boolean resolveStatus;
    private double date;
    private String tailNumber;
    private String problem;
    private String description;

    public void updateStatus(boolean status){
        resolveStatus = status;
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
