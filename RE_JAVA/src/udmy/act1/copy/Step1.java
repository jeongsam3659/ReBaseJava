package udmy.act1.copy;

public class Step1 {

	public static void main(String[] args) {
		/*
		 *  1. ������ 5�� �غ���.
		 *  2. �Ϸ翡 ��� �ִ��� ���.
		 *  3. �Ϸ翡 ���� �ִ��� ���.
		 * 
		*/
		
		//	1
		int a1 = 5, a2 = 10;
		int b1,b2,b3,b4,b5;
		
		b1 = a1 + a2;
		b2 = a1*a2;
		b3 = a2/a1;
		b4 = 4%9;
		b5 = a1/9;
		
		System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4+"\n"+b5);
		System.out.println("---------------------------------");
		
		int second = 1;
		int minute = second*60;
		int hour = minute*60;
		int day  = hour*24;
		
		System.out.println("day :"+day+"\nhour :"+ hour+"\nminute :"+minute+"\nsecond :"+ second);
		System.out.println("�Ϸ� �����ΰ�. :"+day+"��");
		System.out.println("---------------------------------");
		
		System.out.println(5.0/2.0);
		
	}

}
