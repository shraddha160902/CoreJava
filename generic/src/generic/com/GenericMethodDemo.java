package generic.com;

public class GenericMethodDemo {

	public static void main(String[] args) 
	{
		GenericMethod obj=new GenericMethod();
		Integer[]intarray= {21,24,25,60,05};
		String [] str= {"java","Program","From","Github"};
		
		obj.displayArrayElement(intarray);
		obj.displayArrayElement(str);

	}

}
