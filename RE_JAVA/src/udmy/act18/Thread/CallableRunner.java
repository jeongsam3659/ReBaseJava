package udmy.act18.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 

class CallableTask implements Callable<String>{
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello "+name;
	}
}

public class CallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorSc = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorSc.submit(new CallableTask("in28Minutes"));
		System.out.println("new CallableTask(\"in28Minutes\") 적용");
		
		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);
		System.out.print("main 완료");	
	}

}
