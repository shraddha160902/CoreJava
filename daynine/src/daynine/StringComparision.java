package daynine;

public class StringComparision {

	public static void main(String[] args) {
		String s1="Nishu";
		String s2="Nishu";
		
		String s3=new String("Nishu");
		String s4=new String("Nishu");
		
		System.out.println("s1 == s2 :" + (s1 == s2) + "\ts1 equals s2" + s1.equals(s2));
		System.out.println("s1 == s3 :" + (s1 == s3) + "\ts1 equals s3" + s1.equals(s3));
		System.out.println("s4 == s3 :" + (s4 == s3) + "\ts4 equals s3" + s4.equals(s3));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1.compareTo("nishu"));
		System.out.println(s1.compareToIgnoreCase("nishu"));
		System.out.println(s1.compareTo(s2));
		//compareTo () is used for comparing two strings lexicographically. 
		//Each character of both strings are converted into a Unicode value. 
		//However, if both the strings are equal, then this method returns 0 
		//else it only result either negative or positive value.
		
	}

}
