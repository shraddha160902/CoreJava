package userdefinedobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(50);
		
		for(Integer element:list) {
			System.out.println(element);
		
		}
		System.out.println("Traversing using lambda expression");
		list.forEach(element->System.out.println(element));
		System.out.println("--------------------");
		
		System.out.println("Original list"+list);
		System.out.println("--------------------");
		
		Collections.sort(list);
		System.out.println("Sorting in Ascending order"+list);
		System.out.println("--------------------");
		
		Collections.reverse(list);
		System.out.println("Sorting in Descending order"+list);
		System.out.println("--------------------");
		
		Comparator<Integer> comp=(n1,n2) -> n2 - n1;
		
		Collections.sort(list,comp);
		System.out.println("Sorting in Descending order using Lambda Expression"+list);
		System.out.println("--------------------");
		
		ArrayList<student> studentList=new ArrayList<student>();
		student s1=new student(11,"pooja",78);
		studentList.add(s1);
		s1=new student(21,"Nikita",85);
		studentList.add(s1);
		s1=new student(13,"Deepa",68);
		studentList.add(s1);
		s1=new student(41,"Neha",72);
		studentList.add(s1);
		System.out.println(studentList);

		System.out.println("--------------------");
		
		Comparator<student> comp1=(st1,st2) ->(int)(st1.getPercentage()-st2.getPercentage());
		
		Collections.sort(studentList,comp1);
		System.out.println("Students details in  in Ascending order of percentage" +studentList);
		System.out.println("--------------------");
		
		Collections.reverse(studentList);
		System.out.println("Students details in Descending order of percentage"+studentList);
		System.out.println("--------------------");
		 
		comp1 =(st1,st2) -> st1.getName().compareTo(st2.getName());
		
		 Collections.sort(studentList,comp1);
		System.out.println("Student details in ascending order of student name:"+studentList);
		
	}

}
