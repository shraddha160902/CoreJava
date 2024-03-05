package LExp;

public class Calc {

	public static void main(String[] args) {
		
		MyCalculation c=(firstNum,secondNum)->(firstNum+secondNum);
		
		System.out.println(c.add(50,50));
		
		//c=(firstNum,secondNum)->(firstNum-secondNum);
		//System.out.println(c.add(50,50));

	}

}
