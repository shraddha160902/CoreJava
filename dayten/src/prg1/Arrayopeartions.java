package prg1;

public class Arrayopeartions {

	static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println();
	}
	public static int getSum(int...n) {
		int sum=0;
		for(int no:n)
			sum+=no;
		return sum;
	}	
		public static int getoddcount(int b[])
		{
			int count=0;
			for(int i=0;i<b.length;i++) {
				if(b[i]%2!=0)
					count++;
			}
			return count;
		}
		public static int getEvenCount(int b[])
		{
			return b.length-getoddcount(b);
		}
		
	}

