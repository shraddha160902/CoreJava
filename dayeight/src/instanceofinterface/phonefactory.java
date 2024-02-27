package instanceofinterface;

public class phonefactory {
	
	public static phone createPhone (String company)
	{
		if(company.equalsIgnoreCase("samsung"))
			return new samsung();
		else if(company.equalsIgnoreCase("oneplus"))
			return new oneplus();
		return null;
	
	}
	
	}

