package udmy.act10;

public class CaseIf {
	public static void main(String [] args) {
		puzzle1();
	}
	
	private static void puzzle1() {
		int k = 15;
		if(k>20) {
			System.out.println("k는 20보다 크다.");
		}else if(k>10){
			System.out.println("k는 10보다 크다.");
		}else if(k<20){
			System.out.println("k는 20보다 작다.");
		}else {
			System.out.println("???");
		}
	}
	// 2번째 조건에서 끝나면 다음 조건을 실행하지 않는다.
	
	private static void puzzle2() {
		int l = 15;
		if(l < 20) {
			System.out.println("l > 20");
		}	
		
		if(l < 20) {
			System.out.println("l > 20");
		}else {
			System.out.println("난 얼마일까요.");
		}
	}
	//else문 꼭 안쓰일 수도 있다.
	
	private static void puzzle3() {
		int m = 15;
		
		if(m>20) {
			if(m<20) {
				System.out.println("m>20");
			} else {
				System.out.println("난 누구일까요?");
			}
		}
	}
	// {} 사용하지않고 ex)처럼 쓸수있다.
	// 이때 첫번째 조건에 걸려 출력은 나오지않는다. 

	private static void puzzle4() {
//		if(i=1) {
//			System.out.println("i");
//		}
	}
	// =는 지정연산자라 if문에서 사용못한다.
	// 정수도 안된다. ( 0, 1 )

	private static void puzzle5() {
		int number =5;
		if(number < 0) {
			number += 10;
		}
			number++;
		System.out.println(number);
	}
	// 조건문 다음 한 행만 포함된다.
	// {} 써서 구분하자.
	
}




/*
puzzle3 ex_)
 		if(m>20)
			if(m<20)
				System.out.println("m>20");
			else
				System.out.println("난 누구일까요?");
 * */
