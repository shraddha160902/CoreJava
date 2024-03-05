package map.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> bookmap=new HashMap<String,Integer>();
		bookmap.put("Let us c", 320);
		bookmap.put("The complete referece c++", 450);
		bookmap.put("The complete referece java 2", 456);
		bookmap.put("Python programming", 405);
		bookmap.put("application development using spring boot", 500);
		System.out.println(bookmap);
		
		System.out.println("Traversing a hashmap");
		Set set=bookmap.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+":"+ me.getValue());
		}
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("nitin", "nitin123@gmail.com");
		hm1.put("Deepak", null);
		hm1.put(null, "abc");
		hm1.put("Harish", null);
		hm1.put(null, null);
		hm1.put("Ravi","ravi123@gmail.com");
		System.out.println("person Hashmap with name and emailid");
		System.out.println(hm1);
		
		
		HashMap<Integer ,student> studentmap=new HashMap<Integer,student>();
		studentmap.put(101,new student(1,"Ankil",78));
		studentmap.put(102,new student(1,"Amit",18));
		studentmap.put(103,new student(1,"Anu",61));
		studentmap.put(104,new student(1,"Anil",98));
		System.out.println("students details are: "+studentmap);
	}

}
