package basic.com;

import java.util.Scanner;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
	
		for(int j=1;j<=n;j++) 
		{
			for(int i=1;i<=n-j+1;i++) //+1 becz line will get reduce 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


