package udmy.act10.copy;

public class CaseIf2 {
	public static void main(String[] args) {
		puzzle3();
	}
	
	private static void puzzle1() {
		int number =2;
		switch(number) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		default:
			System.out.println("5");
		}
	}
	// �̷���� break�� ����
	// 2�������� 2345 �� ��µȴ�.
	
	private static void puzzle2() {
		int number =2;
		switch(number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
		case 3:
			System.out.println("2, 3");
			break;
		default:
			System.out.println("����Ʈ");
			break;
		}
	}
	
	private static void puzzle3() {
		int number = 10;
		switch(number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
	
	private static void puzzle5() {
		long l = 15;
	//	switch(l) {}
	//  switch �ڿ����� long�� ���ɼ� ����.
	//  char int byte short �� ��밡���ϴ�.
	}
	
	private static void puzzle6() {
		int number = 10;
		switch(number) {
	//	case >5:
	//  case�� ���������̴�.
		}
	}
}
