package regex.com;

import java.util.regex.Pattern;

public class Regexprgm1 {

	public static void main(String[] args) {
		 String sentence ="Hello World";
		 String sentence1="Hi!How are you";
		 
		 String[] st=sentence1.split("\\!");
		 
		 for(String s:st)
			 System.out.println(s);
		 
		 
		 Pattern p=Pattern.compile("\\!");
		 String[] st1=p.split(sentence);
		 		for(String s1:st)
		 			System.out.println(s1);
	}

}
