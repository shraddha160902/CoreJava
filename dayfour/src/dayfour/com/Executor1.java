package dayfour.com;

import  dayfour.com.base;

public class Executor1 {

	public static void main(String[] args) {
	 base b1=new base();
	 
	 // default,protected, private cant be accessed in outside package but here we have not created separted package so we can access
	 
	 b1.methodPublic();
     b1.varPublic=41;
     b1.methodPublic();
	}

}
