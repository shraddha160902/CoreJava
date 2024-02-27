package Threadmethod;

public class ThreadmethodDemo {

	public static void main(String[] args) {
		childThread threadOne=new childThread(5,"First");
		childThread threadTwo=new childThread(10,"Second");
		System.out.println("current thread:"+ Thread.currentThread());
		
		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("parents thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("current Thread: "+Thread.currentThread());
		try {
			threadOne.join();
			threadTwo.join(300);
		}catch(InterruptedException e) {
}
	
	System.out.println("----------End of Main------------");
}
}
