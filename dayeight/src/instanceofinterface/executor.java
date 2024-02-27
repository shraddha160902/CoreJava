package instanceofinterface;

public class executor {

	public static void main(String[] args) {
		phone p1 = phonefactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = phonefactory.createPhone("oneplus"); 
		p1.call();
		p1.sms();
		
	}

}
