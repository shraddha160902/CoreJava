package dayfour.com;

public class Myclass {
 private static Myclass obj =new Myclass();
 
 private int id;
 public String name;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

private Myclass() {
	System.out.println("MyClass object created");
}
	
	 public static Myclass getObj() {
		return obj;
	}
	
@Override
public String toString() {
	return "Myclass [id=" + id + ", name=" + name + "]";
}
}
 

