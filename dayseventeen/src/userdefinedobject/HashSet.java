package userdefinedobject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSet {

	public static void main(String[] args) {
		Set<student> studentset=new HashSet <student>();
		addelements(studentset);
		System.out.println(studentset);
		
	}
	
	static void addelements(Set<student> studentset)
	{
		student s1=new student(78,"pooja");
		studentset.add(s1);
		s1=new student(90,"Nishu");
		studentset.add(s1);
		s1=new student(66,"Neha");
		studentset.add(s1);
	}
	//duplicate elements cant't inserted
}
