package generic.com;

public class GenericMethod 
{
	public <E> void displayArrayElement(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println("Element is:" +element);
		}
	}

}
