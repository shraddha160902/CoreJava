package finallyblock;

import java.util.Scanner;
import java.util.InputMismatchException;
public class finallyblockdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number:");
			int number=sc.nextInt();
			System.out.println(number%2==0?number+" is even":number+" is odd");
			
			}catch(InputMismatchException e) {
				System.out.println("Invalid input ");
			}
		finally {
			System.out.println("In finally block");
			sc.close();
		}
	}

}
