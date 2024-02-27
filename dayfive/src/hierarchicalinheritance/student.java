package hierarchicalinheritance;

public class student extends person1 {
 private String classes;
 private float percentage;
 
 public student () {
	 System.out.println("Student class default constructor");
	 classes="FinalYear";
	 percentage=80;
	 
 }

public student(String classes, float percentage) {
	super();
	this.classes = classes;
	this.percentage = percentage;
}

public String getClasses() {
	return classes;
}

public void setClasses(String classes) {
	this.classes = classes;
}

public float getPercentage() {
	return percentage;
}

public void setPercentage(float percentage) {
	this.percentage = percentage;
}
 public student(String name,String city,String classes,float percentage ) {
	 super(name,city);
	 this.classes=classes;
	 this.percentage=percentage;
 }

@Override
public String toString() {
	return "student [classes=" + classes + ", percentage=" + percentage + ", getName()=" + getName() + ", getCity()="
			+ getCity() + "]";
}
 
 }

