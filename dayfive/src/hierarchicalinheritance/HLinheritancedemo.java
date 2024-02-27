package hierarchicalinheritance;

public class HLinheritancedemo {

	public static void main(String[] args) {
		person1 p1=new person1();
		System.out.println("--------person Details-------");
		System.out.println(p1);
		
		person1 p;
		p=new person1("Dhruv","Mumbai");
		if(p instanceof person1)
			System.out.println("person1 details:"+p);
		
		p=new employee("nikil","mubai",101,6700,"sales");
		if(p instanceof employee)
			System.out.println("Employee details:"+p);
		
		p=new student("pankaj","pune","FE",88);
		if(p instanceof employee)
			System.out.println("Employee details:"+p);

	}

}
