package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point implements Comparable<Point>
{
	float x,y;
	Point()
	{}
	Point(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int compareTo(Point o) {
		return 0;
	}
	
}

public class ListDemo {

	public static void main(String[] args) {
		Point p1=new Point(12,4.5f);
		Point p2=new Point(10,20);
		List<Point> pList=new ArrayList<Point>();
		pList.add(p1);
		pList.add(p2);
		Collections.sort(pList);
		
		List<student>studentList=new ArrayList<student>();
		student s1=new student(11,"pooja",78);
		studentList.add(s1);
		s1 = new student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);
		
		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		Collections.sort(studentList);

		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);

		
		List<person> personList = new ArrayList<person>();
		person p11 = new person("Abhijit", "Mumbai");
		personList.add(p11);

		p11 = new person("Milind", "Pune");
		personList.add(p11);

		p11 = new person("Saurav", "Bangalore");
		personList.add(p11);

		p11 = new person("Madhur", "Delhi");
		personList.add(p11);

		System.out.println("Person list is as follows\n" + personList);

		
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		Collections.sort(personList, new SortByName());

		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		
		Collections.sort(personList, new SortByCity());

		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);

	}

}
