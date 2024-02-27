package comparableandcomparator;

import java.util.Comparator;

public class person {

	private String name;
	private String city;
	
	
	
	
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
	
	
	public person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public person() {
		super();
	
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", city=" + city + "]";
	}
	
}

class SortByName implements Comparator<person> {
	@Override
	public int compare(person p1, person p2) {
		return p1.getName().compareTo(p2.getName());
		}
}

class SortByCity implements Comparator<person> {
	@Override
	public int compare(person p1, person p2) {
		return p1.getCity().compareTo(p2.getCity());
		}
}