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
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
	    
				}
			};
			executorSC.submit(runnable);
            Thread.sleep(100);
		}
		executorSC.shutdown();
	}
}

// ���ܰ� �߻��ϴ��� ���� �����带 ��Ȱ���Ͽ� �۾��� ó���ϴ� ���� �� �� �ִ�.
