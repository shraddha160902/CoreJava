package Threadmethod;

public class childThread extends Thread{
	private int n;
	private String msg;
	
	public childThread(int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
				
			}catch(InterruptedException e) {
				System.out.print("Thread interrupted: "+e.getMessage());
				Thread.currentThread().interrupted();
				
			}
			System.out.println(msg +i+""+Thread.currentThread());
		}
	}

}
