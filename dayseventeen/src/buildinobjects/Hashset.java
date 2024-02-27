package buildinobjects;

import java.util.HashSet;
import java.util.Spliterator;

public class Hashset {
	static void addelements(HashSet<Integer> numberHashSet) {
		numberHashSet.add(10);
		numberHashSet.add(20);
		numberHashSet.add(30);
		numberHashSet.add(40);
		numberHashSet.add(50);
		numberHashSet.add(60);
		numberHashSet.add(60);
		
	}

	public static void main(String[] args) {
		HashSet<Integer> numberHashSet=new HashSet<Integer>();
		addelements(numberHashSet);
		
		HashSet<Integer> numberHashSet1=new HashSet<Integer>();
		numberHashSet1.add(70);
		numberHashSet1.add(80);
		numberHashSet1.add(90);
		numberHashSet1.add(100);
		numberHashSet1.add(50);
		numberHashSet1.add(60);
		
		System.out.println("set 1:"+ numberHashSet);
		System.out.println("set 2:"+ numberHashSet1);
		
		HashSet<Integer> numberHashSet2 = new HashSet<Integer>();
		addelements(numberHashSet2);

		//union
		numberHashSet2.addAll(numberHashSet1);
		System.out.println(" Resultant set:"+ numberHashSet2);
		
		//clear
		numberHashSet2.clear();
		addelements(numberHashSet2);
		//intersection
		numberHashSet2.retainAll(numberHashSet1);
		System.out.println(" Resultant set:"+ numberHashSet2);
		
		numberHashSet2.clear();
		addelements(numberHashSet2);
		//set difference
		numberHashSet2.removeAll(numberHashSet1);
		System.out.println(" Resultant set:"+ numberHashSet2);
		
		
		//split
		Spliterator<Integer> split=numberHashSet.spliterator();
		split.forEachRemaining(System.out::println);
	}

}
