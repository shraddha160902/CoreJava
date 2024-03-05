 package streamApi.daytwenty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamfunctiondemo {

	public static void main(String[] args) {
		
		
		List<String> strList=Arrays.asList("Nashik","Banglore","chennai","Mumbai","Pune");
		System.out.println("List of cities is"+strList);
		
		Stream<String> stream=strList.stream();
		
		long count=streamfunction.countEmptyString(stream);
		System.out.printf("List %s has %d empty string \n",strList,count);
		
		List<String> filteredList=streamfunction.nonEmptyStringList(strList.stream());
		System.out.printf("Original List :%s,List without empty string :%s\n",strList,filteredList);
		
		filteredList=streamfunction.getStrings(strList.stream(), 6);
		System.out.printf("original list :%s,cities length more than 6:%s %n",strList,filteredList);
		
		List<Integer>numbers=Arrays.asList(9,10,3,4,7,3,4);
		Stream<Integer>stream1=numbers.stream();
		
		List<Integer> filteredNumberList=streamfunction.getSquareList(stream1);
		System.out.printf("Original List: %s, square without duplicate:%s %n",numbers,filteredNumberList);
		
		streamfunction.showStatistics(numbers.stream());
	}

}
