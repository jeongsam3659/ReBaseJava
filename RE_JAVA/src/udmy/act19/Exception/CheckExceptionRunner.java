package udmy.act19.Exception;

public class CheckExceptionRunner {
	public static void main(String[] args){
		// ����ó��
		try {
			someMethod();
			Thread.sleep(2000);
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}
	}
	
	private static void someMethod() throws InterruptedException {
		// ���ѱ��
		Thread.sleep(2000);
	}
	private static void some2Method() throws RuntimeException {	
		
	}
}
