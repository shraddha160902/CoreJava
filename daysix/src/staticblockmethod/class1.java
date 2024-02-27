package staticblockmethod;

public class class1 {
	private int section;
	private static int srNo;
	
	static 
	{
		System.out.println("static block start");
		srNo=100;
		
	}
	public class1() {
		System.out.println("Default Constructor");
		srNo++;
		section++;
		
	}
	@Override
	public String toString() {
		return "class1 [serial NO="+srNo+",section=" + section + "]";
	}
	static void display() {
		System.out.println("serial no:"+srNo);
		//section is Non static member we can't access
	}
	
}
