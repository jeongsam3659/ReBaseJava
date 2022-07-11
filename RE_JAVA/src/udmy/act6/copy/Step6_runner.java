package udmy.act6.copy;

public class Step6_runner {
	public static void main(String[] args) {
		Step6_all tableAll = new Step6_all();
		tableAll.printMult();
		
		System.out.println("-----------구분선");
		
//		//Step6 5단 출력해보기.
//		Step6 table5 = new Step6();
//		table5.print();
		
		//매겨변수로 받아서 받기.
		Step6 table5 = new Step6();
		//table5.print(6);
		
		//7단을 ~~*5까지 나타내기.
		//table5.print(7,5);
		
		//7단을 11~~*20까지 나타내기.
		table5.print(7,11,20);
		
		System.out.println("-----------구분선");
		Step6_RE tableRe = new Step6_RE();
		tableRe.print();
		//tableRe.print(6);
	}

}
