package daynine.sample;

 class sample {

}

	class Demo {
		public Demo()
		{		System.out.println("In Constructor");
		
	}
	@Override
	protected void finalize()
	throws Throwable{
		System.out.println("In Finalize");
	}

}
public class objectclass{
	
	public static void main(String[] args) {
		objectclass s=new objectclass();
		objectclass s1=new objectclass();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1=d;
		System.out.println(d1.hashCode());
		d=null;
		System.gc();
		System.out.println(d1);
	
	}
}
