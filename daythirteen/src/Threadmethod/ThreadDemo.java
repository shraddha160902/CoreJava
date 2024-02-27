package Threadmethod;

public class ThreadDemo {

	public static void main(String[] args) {
		childThread threadOne=new childThread(5,"First");
		childThread threadTwo=new childThread(10,"Second");
		
		threadOne.start();
		threadTwo.start();
		
		System.out.println("---------------------End of Main---------");
}

}
