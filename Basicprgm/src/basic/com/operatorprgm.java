package basic.com;

import java.util.Scanner;

public class operatorprgm {

	public static void main(String[] args) {
		
		int x=5;
		System.out.println("Original value: " +x);
		System.out.println("Post increment value: " + (x++));
		System.out.println("After post increment value: " + x);
		System.out.println("Pre increment value : " +(++x));
		System.out.println("Pre increment value: " +x);
	System.out.println("--------------------------------------------");
		
	// if we want input from user we can use this code 	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		System.out.println("Original value: " +x);
		System.out.println("Post increment value: " + (x++));
		System.out.println("After post increment value: " + x);
		System.out.println("Pre increment value : " +(++x));
		System.out.println("Pre increment value: " +x);
	}

}
