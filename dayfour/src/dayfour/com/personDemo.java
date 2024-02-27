package dayfour.com;

import java.util.Scanner;

public class personDemo {

	public static void main(String[] args) {
		Person p1 = new Person(); 

		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1.setPersonname(name);
		p1.setPersonage(age);
		p1.setPersoncity(city);
		System.out.println("Person Details Name : " + p1.getPersonname() + "\tAge : " + p1.getPersonage() + "\tCity : "
				+ p1.getPersoncity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1 = new Person(name, age, city); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonname() + "\tAge : " + p1.getPersonage() + "\tCity : "
				+ p1.getPersoncity());
		sc.close();

	}

}
