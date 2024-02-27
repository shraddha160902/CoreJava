package Finally;

public class FinalVariable {

	final int x=100;
	final static int y;
	final static int z=20;
	
	void change() {
		x = 30;
		y = 200; 
	}
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + y + "]";
	}

	
	static {
		y = 20;
		z = 100; 
		System.out.println("Value of Y: " + y);
	}

}
		
	
	

