package udmy.act18.Thread;

class Task1 extends Thread{
	//메소드 실행을 위한 코드
	public void run() {
		for(int i=101; i<= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task1 Done");
	}
}

class Task2 implements Runnable{
	@Override
	public void run() {
		for(int i=201; i<= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task2 Done");
	}
	
}

public class ThreadBasicRunner {
	public static void main(String [] args) throws InterruptedException {
		
		//Task1 extends Thread
		System.out.print("\n Task1 KickOFF");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		
		//Task2 implements Runnable
		System.out.print("\n Task2 KickOFF");
		Task2 task2 = new Task2();
		Thread task2_thread = new Thread(task2);
		task2_thread.setPriority(10);
		task2_thread.start();
		
		task1.join();
		task2_thread.join();
		
		//Task3
		System.out.print("\n Task3 KickOFF");
		for(int i=301; i<= 399; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n Task3 Done");
		System.out.println("Main Done");
	
		
	}
}
