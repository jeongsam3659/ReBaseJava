package udmy.act18.Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorSc = Executors.newFixedThreadPool(1);
		// ���������۾�.
		List<CallableTask> tasks=List.of(new CallableTask("A1Picutre"), new CallableTask("B2rancustor"), new CallableTask("C3Nanomachine"));
		
		List<Future<String>> results = executorSc.invokeAll(tasks);
		
		// �ݺ������� ����Ʈ �� �� ��ȯ
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		executorSc.shutdown();
	}

}
