package udmy.act10;

public class CaseIf {
	public static void main(String [] args) {
		puzzle1();
	}
	
	private static void puzzle1() {
		int k = 15;
		if(k>20) {
			System.out.println("k�� 20���� ũ��.");
		}else if(k>10){
			System.out.println("k�� 10���� ũ��.");
		}else if(k<20){
			System.out.println("k�� 20���� �۴�.");
		}else {
			System.out.println("???");
		}
	}
	// 2��° ���ǿ��� ������ ���� ������ �������� �ʴ´�.
	
	private static void puzzle2() {
		int l = 15;
		if(l < 20) {
			System.out.println("l > 20");
		}	
		
		if(l < 20) {
			System.out.println("l > 20");
		}else {
			System.out.println("�� ���ϱ��.");
		}
	}
	//else�� �� �Ⱦ��� ���� �ִ�.
	
	private static void puzzle3() {
		int m = 15;
		
		if(m>20) {
			if(m<20) {
				System.out.println("m>20");
			} else {
				System.out.println("�� �����ϱ��?");
			}
		}
	}
	// {} ��������ʰ� ex)ó�� �����ִ�.
	// �̶� ù��° ���ǿ� �ɷ� ����� �������ʴ´�. 

	private static void puzzle4() {
//		if(i=1) {
//			System.out.println("i");
//		}
	}
	// =�� ���������ڶ� if������ �����Ѵ�.
	// ������ �ȵȴ�. ( 0, 1 )

	private static void puzzle5() {
		int number =5;
		if(number < 0) {
			number += 10;
		}
			number++;
		System.out.println(number);
	}
	// ���ǹ� ���� �� �ุ ���Եȴ�.
	// {} �Ἥ ��������.
	
}




/*
puzzle3 ex_)
 		if(m>20)
			if(m<20)
				System.out.println("m>20");
			else
				System.out.println("�� �����ϱ��?");
 * */
