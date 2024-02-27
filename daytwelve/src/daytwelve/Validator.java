package daytwelve;

public class Validator {
	static boolean validateAge(int age)throws InvalidAgeException{
		boolean isValid=false;
		if(age<18)
			throw new InvalidAgeException("Invalid age.you are not eligible to vote");
		else
			isValid=true;
		return isValid;
	}
}
