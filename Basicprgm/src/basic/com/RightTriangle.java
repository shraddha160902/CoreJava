package basic.com;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
	
		for(int j=1;j<=n;j++) 
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


