package udmy.act19.Exception;

public class ExceptionHandlingTryCatch {
	public static void main(String []args) {
		NullPointMethod2();
		System.out.println("Main end");
	}
	
	private static void NullPointMethod2() {
		NullPointMethod();
		System.out.println("Method2 end");
	}

	private static void NullPointMethod() {
		try {
//			NullPointerExceptions
//			String str = null;
//			str.length();
			int[] i = {1,2};
			int nuber = i[3];
			
		} catch(NullPointerException Nulle) {
			System.out.println("�����׸� : NullPointerException");
			Nulle.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException Arraye) {
			System.out.println("�����׸� : ArrayIndexOutOfBoundsException");
			Arraye.printStackTrace();
		} catch (Exception e) {
			System.out.println("�����׸� : ���ܻ��� �߻�");
			e.printStackTrace();
		}
	}
}

//  ���ܻ�Ȳ �߻��� ����� ó���� ���� ������ Ư�� �޼ҵ忡�� ������ ��� �ڵ�� ����� �� ���ٴ� ��

