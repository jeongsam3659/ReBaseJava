package udmy.act18.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadSumbitEx {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorSC = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExe = (ThreadPoolExecutor)executorSC;
					int poolSize = threadPoolExe.getPoolSize();
					
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
	    
				}
			};
			executorSC.submit(runnable);
            Thread.sleep(100);
		}
		executorSC.shutdown();
	}
}

// 예외가 발생하더라도 기존 스레드를 재활용하여 작업을 처리하는 것을 알 수 있다.
