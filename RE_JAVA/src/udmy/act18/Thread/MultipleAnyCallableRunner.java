package udmy.act18.Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorSc = Executors.newFixedThreadPool(3);
		// 여러개의작업.
		List<CallableTask> tasks=List.of(new CallableTask("A1Picutre"), new CallableTask("B2rancustor"), new CallableTask("C3Nanomachine"));
		
		String result = executorSc.invokeAny(tasks);
		System.out.println(result);
		
		executorSc.shutdown();
	}

}
