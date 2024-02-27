package daythree.com;

import java.util.Scanner;

public class constructordemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.print("Enter customer ID:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter customer name:");
		name=sc.nextLine();
		
		System.out.print("Enter customer city:");
		city=sc.nextLine();
		
		System.out.print("");
		
		customer c1=new customer();
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomercity(city);
		System.out.print(c1);
		
		System.out.print("Enter customer ID:");
		id=sc.nextInt();
		System.out.print("Enter customer name:");
		name=sc.nextLine();
		System.out.print("Enter customer city:");
		city=sc.nextLine();
		
		// without this also we run the prgm
		customer c2=new customer(name,id,city);
		System.out.print(c2);
		
		sc.close();
		
		}

}
