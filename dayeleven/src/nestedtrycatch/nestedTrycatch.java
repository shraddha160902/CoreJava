package nestedtrycatch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class nestedTrycatch {

	public static void main(String[] args) {
		String name;
		int pos;
		try(Scanner sc=new Scanner(System.in)){
				
				try {
					System.out.println("Enter the name:");
					name=sc.next();
					System.out.println("Enter the position:");
					pos=sc.nextInt();
					try {
						System.out.println("character at index " +pos+ " in " +name+" is " + name.charAt(pos));
					}catch(StringIndexOutOfBoundsException e) {
							System.out.print(e.getMessage());
						}
						
					
				}catch(InputMismatchException e) {
						System.out.print("please enter integer");
					}
				}
	}

}
