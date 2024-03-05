package map.com;

import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmap {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> m= new ConcurrentHashMap<>();
		
		m.put(100,"Hello");
		m.put(101,"How are you?");
		m.put(102,"Fine");
		
		System.out.println(m);
		
		m.putIfAbsent(101,"Hello");
		System.out.println(m);
		
		m.remove(101,"How are you?");
		System.out.println(m);
		
		m.putIfAbsent(103,"Hello");
		System.out.println(m);
		
		m.replace(100,"Hello","For");
		System.out.println(m);
		
		
		
	}

}
