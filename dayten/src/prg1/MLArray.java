package prg1;

public class MLArray {

	static void printArray(int c[][])
	{
		System.out.println("Array Element are as follows:");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++)
				System.out.println(c[i][j]+"");
			System.out.println();
		}
	}
}
