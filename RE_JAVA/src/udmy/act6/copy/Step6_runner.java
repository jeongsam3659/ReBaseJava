package udmy.act6.copy;

public class Step6_runner {
	public static void main(String[] args) {
		Step6_all tableAll = new Step6_all();
		tableAll.printMult();
		
		System.out.println("-----------���м�");
		
//		//Step6 5�� ����غ���.
//		Step6 table5 = new Step6();
//		table5.print();
		
		//�Űܺ����� �޾Ƽ� �ޱ�.
		Step6 table5 = new Step6();
		//table5.print(6);
		
		//7���� ~~*5���� ��Ÿ����.
		//table5.print(7,5);
		
		//7���� 11~~*20���� ��Ÿ����.
		table5.print(7,11,20);
		
		System.out.println("-----------���м�");
		Step6_RE tableRe = new Step6_RE();
		tableRe.print();
		//tableRe.print(6);
	}

}
