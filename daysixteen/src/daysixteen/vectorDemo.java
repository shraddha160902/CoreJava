package daysixteen;

import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {
		Vector<String>animals=new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Monkey");
		
		System.out.print("Initial Vector :"+ animals+"\n");
		
		String element=animals.get(2);
		System.out.print("Elements at index 2:"+ element+"\n");
		
Iterator<String>iterate=animals.iterator();
System.out.print("Vector:");
while(iterate.hasNext()) {
	System.out.print(iterate.next());
	System.out.print(",");
}

element=animals.remove(1);
System.out.print("\n"+"Remove element :"+ element+"\n");
System.out.print("New Vector :"+ animals+"\n");

	animals.clear();
	System.out.print("Vector after clear :"+ animals);
	
	}

}
