package udmy.act19.Exception;

public class ExceptionHandlingRunner {
	public static void main(String []args) {
		NullPointMethod();
	}

	private static void NullPointMethod() {
//		NullPointerExceptions
		String str = null;
		str.length();
	}
}

//  예외상황 발생시 제대로 처리해 주지 않으면 특정 메소드에서 이후의 모든 코드는 실행될 수 없다는 점