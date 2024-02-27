package multiplecatch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class multiplecatchdemo {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		while(true) {
			try {
				a=sc.nextInt();	
				b=sc.nextInt();
				c=a/b;
				System.out.println("Division is " +c);
				break;
				
			}catch(InputMismatchException e) {
				System.out.println("Invalid input please enter integer only");
				sc.nextLine();

				}catch(ArithmeticException e) {
					System.out.println("Exception caught:"+ e.getMessage());
					break;
				}catch(Exception e) {
					System.out.println("Exception caught:"+ e.getMessage());
					break;
		}

	}
sc.close();
	}
}
