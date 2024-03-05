package streamApi.daytwenty;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamfunction {
 
	public static long countEmptyString(Stream<String> stream) {
		long count=0;
		count=stream.filter(x->!x.isEmpty()).count();
		return count;
		
	}
	
	public static long countString(Stream<String>stream,int n) {
		long num=stream.filter(x->x.length()>n).count();
		return num;
	}
	public static List<String> nonEmptyStringList(Stream<String> stream){
		List<String> filteredList=stream.filter(x->!x.isEmpty()).collect(Collectors.toList());
		return filteredList;
		
	}
	public static List<String> getStrings(Stream<String> stream,int n){
		List<String> filteredList=stream.filter(x->x.length()>n).collect(Collectors.toList());
		return filteredList;
}
	public static List<Integer>getSquareList (Stream<Integer> stream){
		List<Integer> squareList=stream.distinct().map(i->i*i).collect(Collectors.toList());
		return squareList;
	}
	
	public static void showStatistics(Stream<Integer> stream) {
		IntSummaryStatistics stats=stream.mapToInt((x)->x).summaryStatistics();
		System.out.println("Highest number in list :"+stats.getMax());
		System.out.println("Lowest number in list :"+stats.getMin());
		System.out.println("Sum of all number in list :"+stats.getSum());
		System.out.println("Average of all number in list :"+stats.getAverage());
		
	}
}
		
	
