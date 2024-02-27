package prg1;

public class Driver {

	public static void main(String[] args) {
	 int n=10;
	 int a[];
	 a=new int[n];
	 
	 Arrayopeartions.printArray(a);
	 
	 for(int i=0;i<a.length;i++)
		 a[i]=5*i;
	 
	 Arrayopeartions.printArray(a);
	 
	 int b[]= {10,20,30,40,50};
	 Arrayopeartions.printArray(b);
	 
	 System.out.println("Summ of array elements is:"+ Arrayopeartions.getSum(b));
	 System.out.println("Summ of array elements is:"+ Arrayopeartions.getSum(10,20));
	 
	 b[2]=999;
	 Arrayopeartions.printArray(b);
	 
	 System.out.println("odd numbers:"+Arrayopeartions.getoddcount(b)+"\t Even numbers:"+Arrayopeartions.getEvenCount(b));
	 System.out.println();
	 System.out.println("--------------");
	 
	 int c[];
	

	}

}
