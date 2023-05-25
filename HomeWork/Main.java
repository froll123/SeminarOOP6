package SeminarOOP6.HomeWork;

public class Main{
    public static void main(String[] args){
		IUser user = new User("Bob");
		new Report(user).report();
		new SaveUser(user).save();
	}
}