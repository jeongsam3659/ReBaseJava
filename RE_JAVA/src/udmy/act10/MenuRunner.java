package udmy.act10;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		System.out.println("1�� ���ڸ� �Է��ϼ���. :");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		
		System.out.println("2�� ���ڸ� �Է��ϼ���. :");
		int number2 = sc.nextInt();
		
		System.out.println("��ȣ�� �����ϼ���. ");
		System.out.println("1 - ���ϱ�");
		System.out.println("2 - ����");
		System.out.println("3 - ���ϱ�");
		System.out.println("4 - ������");
		
		System.out.println("�Է� :");
		int choiceNum = sc.nextInt();
		
		System.out.println("Number1 :" + number1);
		System.out.println("Number2 :" + number2);
		System.out.println("���� -" + choiceNum);
		performSwitchIF(number1, number2, choiceNum);
	/*	
		if(choiceNum == 1 ) {
			System.out.println("��� : " +(number1+number2));
		}else if(choiceNum == 2 ) {
			System.out.println("��� : " +(number1-number2));
		}else if(choiceNum == 3 ) {
			System.out.println("��� : " +(number1*number2));
		}else if(choiceNum == 4 ) {
			System.out.println("��� : " +(number1/number2));
		}else {
			System.out.println("������ �߸��Ǿ����ϴ�.");
		}
	*/
	}
	
	
	public static void performSwitchIF(int number1, int number2, int choiceNum) {
		switch(choiceNum) {
		case 1:
			System.out.println("Result :"+ (number1+number2));
			break;
		case 2:
			System.out.println("Result :"+ (number1-number2));
			break;
		case 3:
			System.out.println("Result :"+ (number1*number2));
			break;
		case 4:
			System.out.println("Result :"+ (number1/number2));
			break;
		default:
			System.out.println("������ �߸��Ǿ����ϴ�.");
			break;
		}
	}
	
}
