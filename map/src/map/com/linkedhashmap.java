package map.com;

import java.util.LinkedHashMap;

public class linkedhashmap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer>lhmap=new LinkedHashMap<String,Integer>();
		lhmap.put("Nish", 4);
		lhmap.put("Nagu", 3);
		lhmap.put("dheeru", 2);
		lhmap.put("Shraddha", 1);
		System.out.println("Students Details" +lhmap);
		lhmap.put("dhruv", 5);
		System.out.println("Students Details after update" +lhmap);
		
		lhmap.put("sanju", null);
		System.out.println("Students Details" +lhmap);
		
		lhmap.put(null, null);
		System.out.println("Students Details" +lhmap);
		
		
	}

}
