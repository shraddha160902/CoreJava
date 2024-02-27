package runnable;

public class runnabledemo {

	public static void main(String[] args) {
		Runnableprgm obj=new Runnableprgm(10,20,"Hello");
		Runnable runnable=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable with anonymouse class");
			
		}

	};
	Thread thread=new Thread(runnable);
	thread.start();
	runnable=()->{
		System.out.println("Runnable with Lambda Expression");
	};
	
	new Thread(runnable).start();

	System.out.println("-------------------------------------------------------");
		int n = 5;
		runnable = () -> {
		try {
		
			for(int i=1;i<=n;i++) {
				System.out.println("Loop iteration "+i);
				Thread.sleep(1000);
				
			}
			
		}catch(InterruptedException e) {
			System.out.println("Task interrupted");
		}
	};
	new Thread(runnable).start();
}
}
