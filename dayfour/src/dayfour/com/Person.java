package dayfour.com;

public class Person {

	private String personname;
	private int personage;
	private String personcity;
	
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public int getPersonage() {
		return personage;
	}
	public void setPersonage(int personage) {
		this.personage = personage;
	}
	public String getPersoncity() {
		return personcity;
	}
	public void setPersoncity(String personcity) {
		this.personcity = personcity;
	}
	
	public Person() {
		System.out.println("Default Constructor");
	}
	
	public Person(String personname, int personage, String personcity) {
		super();
		this.personname = personname;
		this.personage = personage;
		this.personcity = personcity;
	}
	
	
}
