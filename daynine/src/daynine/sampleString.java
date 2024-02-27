package daynine;

public class sampleString {

	public static void main(String[] args) {
		
		char c[]= {'I','N','D','I','A'};
			String s1=new String(c);
			String s2=new String(s1);
			
			System.out.println(s1);
			System.out.println(s2);
			
			String longStr="This is to show"+"\t how string concation"+"can happen with addition"+"\t opeartion.";
			System.out.println(longStr);
		}

}
