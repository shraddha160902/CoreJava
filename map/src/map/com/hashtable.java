package map.com;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		
		Hashtable<String,String>ht= new Hashtable<String,String>();
		ht.put("Nish", "nishu16@gmail.com");
		ht.put("Nagu", "nagu16@gmail.com");
		ht.put("dheeru", "dheeru16@gmail.com");
		ht.put("Sanju", "Sanju16@gmail.com");
		
		System.out.println("\n Hashtable with name and emailId");
		System.out.println(ht);
		
		System.out.println("\nTraversing a hashtable\n");
		Enumeration  em=ht.keys();  //enumeration is a special data type which contains a set of predefined constants.
		while(em.hasMoreElements()) {
			String nm=em.nextElement().toString();
			System.out.println(nm+":"+ht.get(nm));
		}

	}

}
