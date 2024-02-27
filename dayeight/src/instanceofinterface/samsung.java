package instanceofinterface;

public class samsung implements phone {
	
	@Override
	public void call()
	{
		System.out.println("Calling Using samsung");
	}
	public void sms()
	{
		System.out.println("Message Using samsung");
	}

}
