package checkeddemo;
import java.io.IOException;
public class checkedExceptionDemo {

	public static void main(String[] args) {

				try {
					String str=checkException.acceptText();
					System.out.println("your string is "+str);
					
				}catch(IOException e) {
					System.out.print("An error occured while reading input:"+e.getMessage());
				}
			}

		


	}


