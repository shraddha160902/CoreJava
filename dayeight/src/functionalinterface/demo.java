package functionalinterface;

public class demo {

	public static void main(String[] args) {
		Greetclass g= new Greetclass();
		System.out.println(g.greet());
		
		GreetInterface g1=()->{
			return "Good Afternoon";
		};
		System.out.println(g1.greet());
		}
	}


