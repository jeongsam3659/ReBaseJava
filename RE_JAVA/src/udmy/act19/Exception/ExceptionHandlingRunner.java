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

//  ���ܻ�Ȳ �߻��� ����� ó���� ���� ������ Ư�� �޼ҵ忡�� ������ ��� �ڵ�� ����� �� ���ٴ� ��