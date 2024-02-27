package trycatch;

public class trycatchexample {

	public static void main(String[] args) {
		//System.out.println("I m in method");
		int result;
		
		result=trycatchblock.performDivision(16,0);
		if(result!=0)
			System.out.println("Division is"+result);
		
		System.out.println("---------------");
		System.out.println(trycatchblock.performDivision(16f,2f));
		
		System.out.println("---------------");
		System.out.println(trycatchblock.performDivision(16f,0f));
		
	}

}
