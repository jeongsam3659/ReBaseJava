package udmy.act6.copy;

public class Step6 {

	//	5�� ����غ���.
	void print() {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d",5,i,5*i).println();
		}
	}
	
	//��� ���� �ް� ����ϱ�.
	void print(int numberA) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d",numberA,i,numberA*i).println();
		}
	}
	
	//��� ���� ~������ ����ϱ�.
	void print(int numberA, int numberB) {
		for(int i=1; i<=numberB; i++) {
			System.out.printf("%d * %d = %d",numberA,i,numberA*i).println();
		}
	}
	
	//��� ���� ~������ ����ϱ�.
	void print(int numberA, int numberB, int numberC) {
		for(int i=numberB; i<=numberC; i++) {
			System.out.printf("%d * %d = %d",numberA,i,numberA*i).println();
		}
	}
	

}
