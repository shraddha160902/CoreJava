package dayfour.com;

public class privateConstructor {

	public static void main(String[] args) {
		
		Myclass m = Myclass.getObj();
		m.setId(20);
		m.setName("hi");
		
		Myclass m1 =Myclass.getObj();
		m1.setId(16);
	    m1.setName("hello");
		
		System.out.println(m);
		System.out.println(m1);
	}

}
