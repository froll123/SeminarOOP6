package SeminarOOP6.HomeWork;

public class Persister{
	private final IUser user;
	
	public Persister(IUser user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}
