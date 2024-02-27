package overriding;

public class overridingDemo {

	public static void main(String[] args) {
		RBI rbi=new RBI();
		System.out.println(rbi.getRateOfInterst());
		
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterst());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterst());

		rbi=new ICIC();
		System.out.println(rbi.getRateOfInterst());


	}

}
