package SeminarOOP6.HomeWork;

public class Report {
    private final IUser user;

    public Report(IUser user){

        this.user = user;
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}