package LExp;

public class Lambdawithoutparameter {

	public static  void main(String[] args) {
		
		Statement s=() -> {
			return "Hello";
			};
		System.out.println(s.show());

	}

}
