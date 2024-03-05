package predefinedannotation;

import java.util.ArrayList;
import java.util.List;

public class predefinedannotationDemo {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
			@SuppressWarnings("rawtypes")
			List al=new ArrayList();
			students s2=new students(102,"Nishu","CSE");
			al.add(10);
			al.add(22.22f);
			al.add(new students(101,"Dheeraj","ECE"));
			al.add("EWCE");
			al.add(s2);
	}

}
