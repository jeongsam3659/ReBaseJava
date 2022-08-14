package udmy.act19.Exception;

public class CheckExceptionRunner {
	public static void main(String[] args){
		// 강제처리
		try {
			someMethod();
			Thread.sleep(2000);
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
	}
	
	private static void someMethod() throws InterruptedException {
		// 떠넘기기
		Thread.sleep(2000);
	}
	private static void some2Method() throws RuntimeException {	
		
	}
}
