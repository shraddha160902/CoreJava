package regex.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prgm2 {

	public static void main(String[] args) {
		String sentence="This is a class for Java Full Stack";
		
		
		Pattern p=Pattern.compile("is");
		Matcher m=p.matcher(sentence);
		while(m.find())//find->finds the next expression that match the pattern
		{
			System.out.println(m.group());
		}
		

	}

}
