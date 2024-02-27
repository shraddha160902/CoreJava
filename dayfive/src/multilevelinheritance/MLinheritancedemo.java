package multilevelinheritance;
import java.util.Date;
import java.text.SimpleDateFormat;
public class MLinheritancedemo {

	public static void main(String[] args) {
		System.out.println("person Details:");
		
		person p1 = new person("Atharv", 7878767676l, new Date(2000, 12, 2));
		System.out.println(p1);
		
		System.out.println("Employee Details:");
		
		p1 = new employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
		System.out.println(p1);
		
		System.out.println(" First Employee Details:");
		
		p1 = new firstemployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);
		
	}

}
