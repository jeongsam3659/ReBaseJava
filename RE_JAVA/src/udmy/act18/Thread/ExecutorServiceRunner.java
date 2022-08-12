package udmy.act18.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int number;
	
	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.print("\n Task "+number+"Start");
		for(int i=number*100; i<=100+99; i++) {
			System.out.print(i + " "); // i=1 , 100~ 199
		}
		System.out.print("\n Task "+number+"Done");
	}
}

public class ExecutorServiceRunner {
	public static void main(String[] args) {
		// ExecutorService executorSC = Executors.newSingleThreadExecutor();
		ExecutorService executorSC = Executors.newFixedThreadPool(4);
		
		executorSC.execute(new Task(1));
		executorSC.execute(new Task(2));
		executorSC.execute(new Task(3));
		executorSC.execute(new Task(4));
		executorSC.execute(new Task(5));
		executorSC.execute(new Task(6));
		executorSC.shutdown();
	}

}
