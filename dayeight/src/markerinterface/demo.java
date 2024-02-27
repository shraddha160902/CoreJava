package markerinterface;

public class demo {

	public static void main(String[] args) {
		student s=new student(101,"Neha",12000,"C++");
		//student s1=new student(101,"Nishu",12000,"JAVA");
		if (s instanceof register)
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
		
		/*if (s1 instanceof register)
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");*/
			
	}

}
