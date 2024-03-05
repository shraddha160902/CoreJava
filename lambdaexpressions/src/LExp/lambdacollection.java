package LExp;

import java.util.ArrayList;

public class lambdacollection {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		
		for(int a:list)
		{
			System.out.println(a);
			
		}
		System.out.println("Traversing using lambda expression");
		list.forEach(a->System.out.println(a));
	}

}
