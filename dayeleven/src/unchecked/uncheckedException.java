package unchecked;


public class uncheckedException {

	public static void main(String[] args) {
		
		try {
			int x[];
			 x=new int[] {1,2,3,4};
			 System.out.println(x[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("specified index does not exist.\n"+e.getMessage());
		}	
		}
	}


