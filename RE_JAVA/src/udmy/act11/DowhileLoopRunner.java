package udmy.act11;

import java.util.Scanner;

public class DowhileLoopRunner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		do {
			if(number != -1) {
				System.out.println("�������� : "+(number*number*number));
			}
			System.out.println("���ڸ� �Է��ϼ���: ");
			number = sc.nextInt();
			
		}while(number >= 0);
		System.out.println("������ �����մϴ�. ^^");
		
	}
}
