package datetimeapi.com;

import java.time.ZoneId;

public class zoneDemo {

	public static void main(String[] args) {
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
	}

}
