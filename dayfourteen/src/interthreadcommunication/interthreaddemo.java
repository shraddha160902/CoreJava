package interthreadcommunication;

public class interthreaddemo {

	public static void main(String[] args) {
		Q obj=new Q();
		
		producer p1=new producer(obj);
		consumer c1=new consumer(obj);
		
		try {
			p1.join();
			c1.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
