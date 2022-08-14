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
			System.out.println("오류항목 : NullPointerException");
			Nulle.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException Arraye) {
			System.out.println("오류항목 : ArrayIndexOutOfBoundsException");
			Arraye.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류항목 : 예외사항 발생");
			e.printStackTrace();
		}
	}
}

//  예외상황 발생시 제대로 처리해 주지 않으면 특정 메소드에서 이후의 모든 코드는 실행될 수 없다는 점

