package Thread1;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Mychildthread myThread= new Mychildthread();
		System.out.println("Before Runnable stage thread is alive or not?"+ myThread.isAlive());
		myThread.start();
		try {
			Thread.sleep(4000);
			
		}catch(InterruptedException e) {
			System.out.println("Thread is interrupted!");
		}
			System.out.print("After complete execution of thread ,it is alive or not?" + myThread.isAlive());	
	}

}
