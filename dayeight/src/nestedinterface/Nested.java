package nestedinterface;

public class Nested implements MyInterface.MyInnerInterface {

	@Override
	
	public  void print() {
		System.out.println("print method of nested interface");

	}

}
