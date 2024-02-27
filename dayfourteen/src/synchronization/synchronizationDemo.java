package synchronization;

public class synchronizationDemo {

	public static void main(String[] args) {
		Account acc=new Account(101,"Amit",5000);
		System.out.println(acc);
		
		AccountThread thread[]=new AccountThread[5];
		for(int i=0;i<5;i++) {
			thread[i]=new AccountThread(acc,1000*(i+1));
			try {
				thread[i].join();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("--------------------------");
		System.out.println(acc);
	}

}
