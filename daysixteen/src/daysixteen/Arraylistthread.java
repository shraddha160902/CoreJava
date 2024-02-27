package daysixteen;

import java.util.ArrayList;

public class Arraylistthread {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		
		Thread producerThread=new Thread(new Numberproducer(numbers));
		Thread consumerThread=new Thread(new Numberconsumer(numbers));
		producerThread.start();
		consumerThread.start();

	}
	
	static class Numberproducer implements Runnable{
		private final ArrayList<Integer>numbers;
		
		public Numberproducer(ArrayList<Integer> numbers) {
			this.numbers=numbers;
		}
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				numbers.add(i);
				System.out.println("produced:"+i);
			}
		}
	}

}
	 class Numberconsumer implements Runnable{
		private final ArrayList<Integer> numbers;
	
		public Numberconsumer(ArrayList<Integer> numbers2) {
			this.numbers=numbers2;
		}
		@Override
		public void run() {
			while(true){
				if(!numbers.isEmpty()) {
					int number=numbers.remove(0);
					System.out.println("consumer:"+number);
				}
			}
	   }
	
  }
 			
		

