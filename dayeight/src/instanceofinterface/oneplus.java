package instanceofinterface;

public class oneplus implements phone{
	
	@Override
	public void call()
	{
		System.out.println("Calling Using oneplus");
	}
	public void sms()
	{
		System.out.println("Message Using oneplus");
	}
}
