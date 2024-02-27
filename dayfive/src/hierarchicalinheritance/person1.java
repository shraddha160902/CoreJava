package hierarchicalinheritance;

public class person1 {
	private String name;
	private String city;
	
	public person1() {
		System.out.println("person class default constructor");
		name="Nishu";
		city="Blore";
	}

	public person1(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "person1 [name=" + name + ", city=" + city + "]";
	}
	

}
