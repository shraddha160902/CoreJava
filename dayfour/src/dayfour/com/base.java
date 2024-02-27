package dayfour.com;

public class base {
	int varDefault=10;
	public int varPublic=20;
	public int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{ 
		System.out.println("Default access base class");
	System.out.println("Default variable:"+varDefault);
	}
	
	 public void methodPublic()
	{ 
		System.out.println("Public access base class");
	System.out.println("public variable:"+varPublic);
	}
	 
	  private void methodPrivate()
		{ 
			System.out.println("private access base class");
		System.out.println("private variable:"+varPrivate);
		}
	  protected void methodProtected()
		{ 
			System.out.println("  protected access base class");
		System.out.println(" protected  variable:"+varProtected );
		}
	

}
