package daythree.com;

public class taxcalculation {
	
	public void calculateTax(Person person) {
		
		if(person.getage()>65 ||person.getgender().equalsIgnoreCase("female")) {
			person.settax(0);
			System.out.println("Tax not applicable");
			
		}else {
			if(person.getincome()<=160000) {
				person.settax(0);
				
			
			}else if(person.getincome()>160000 && person.getincome<=500000) {
				person.settax((person.getincome()-160000)*10/100);
				
			}else if(person.getincome()>500000 && person.getincome<=800000) {
				person.settax((person.getincome()-500000)*20/100+34000);
	
			
			}else {
				person.settax((person.getincome()-800000)*30/100+94000);
					
			}
		}
	}

}
