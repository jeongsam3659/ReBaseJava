package udmy.act6;

public class Step6_RE {
	// Step6의 문제점.
	//  - 출력문의 중복성.
	//  - 이것을 해결하기 위해 축약시켜야한다. (3)

	//	5단 출력해보기.
	void print() {
		print(5, 1, 9);
	}
	
	//어떠한 수를 받고 출력하기.
	void print(int numberA) {
		print(numberA, 1, 9); // 자기 자신으로 하여금 (3)번로 이동한다.
	}
	
	//어떠한 수를 ~까지로 출력하기. // (3)
	void print(int numberA, int numberB, int numberC) {
		for(int i=numberB; i<=numberC; i++) {
			System.out.printf("%d * %d = %d",numberA,i,numberA*i).println();
		}
	}
	

}
