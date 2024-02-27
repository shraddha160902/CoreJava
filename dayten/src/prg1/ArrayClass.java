package prg1;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int intarr[]= {10,20,15,22,35,18,14};
		
		System.out.println("Array is:"+Arrays.toString(intarr));
		Arrays.sort(intarr);
		System.out.println("------------After Sorting----------------");
		System.out.println("Array is:"+Arrays.toString(intarr));
		
		int intkey=22;
		System.out.println(intkey+"\tfound at index="+Arrays.binarySearch(intarr,intkey));
		System.out.println(intkey+"\tfound at index="+Arrays.binarySearch(intarr,1,3,intkey));
		
	System.out.println("First Array : " + Arrays.toString(intarr));
		
		
		int intArr1[] = { 10, 15, 22 };
		System.out.println("Second Array : " + Arrays.toString(intArr1));

		
		if (Arrays.equals(intarr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal");

		
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intarr, 10);
		System.out.println("Integer Array: " + Arrays.toString(intArr2));

		System.out.println("\nNew Arrays by copyOfRange:");
	
		int intArr3[]=Arrays.copyOfRange(intarr, 1, 3);
		System.out.println("Integer Array: " + Arrays.toString(intArr3));

		
		Arrays.fill(intarr, intkey);
	
		System.out.println("Integer Array on filling 22: " + Arrays.toString(intarr));

	}

	}

