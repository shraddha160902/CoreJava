package overloading;

public class overloadingDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Constructor Overloading");
		
		point p=new point ();
		System.out.println(p);
		
		point p1=new point(2,3);
		System.out.println(p1);
		
		point p2=new point(2.0f,3.0f);
		System.out.println(p2);
		
		/*point p3=new point(2.0f,3);
		System.out.println(p3);
		
		point p4=new point(2,3.0f);
		System.out.println(p4);*/
	

	System.out.println("------------------------ Method Overloading -----------------------");
	System.out.println("Addition of two integers : " + overloadingmethod.addition(10, 20));
	System.out.println("substration of two integers : " + overloadingmethod.substration(20, 10));
	System.out.println("Addition of two floating numbers :" + overloadingmethod.addition(10.0f, 20.f));
	System.out.println("Addition of one integer and one float :" + overloadingmethod.addition(10, 20.0f));
	System.out.println("Addition of one float and one integer :" + overloadingmethod.addition(10.0f, 20));
	//System.out.println("Addition of two Strings : " + overloadingmethod.addition("Hello ", "World"));
}
}


