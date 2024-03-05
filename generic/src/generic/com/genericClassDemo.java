package generic.com;

public class genericClassDemo {

	public static void main(String[] args) {
		genericClass<String> strobj=new genericClass <String>();
		 strobj.set("NISH");
		 System.out.println(strobj.get());
		 
		 genericClass<Integer> intobj=new genericClass<Integer>();
		 intobj.set(16);
		 System.out.println(intobj.get());

	}

}
