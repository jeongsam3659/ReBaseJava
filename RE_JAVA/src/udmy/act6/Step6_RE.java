package udmy.act6;

public class Step6_RE {
	// Step6�� ������.
	//  - ��¹��� �ߺ���.
	//  - �̰��� �ذ��ϱ� ���� �����Ѿ��Ѵ�. (3)

	//	5�� ����غ���.
	void print() {
		print(5, 1, 9);
	}
	
	//��� ���� �ް� ����ϱ�.
	void print(int numberA) {
		print(numberA, 1, 9); // �ڱ� �ڽ����� �Ͽ��� (3)���� �̵��Ѵ�.
	}
	
	//��� ���� ~������ ����ϱ�. // (3)
	void print(int numberA, int numberB, int numberC) {
		for(int i=numberB; i<=numberC; i++) {
			System.out.printf("%d * %d = %d",numberA,i,numberA*i).println();
		}
	}
	

}
