package udmy.act10;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		System.out.println("1번 숫자를 입력하세요. :");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		
		System.out.println("2번 숫자를 입력하세요. :");
		int number2 = sc.nextInt();
		
		System.out.println("번호를 선택하세요. ");
		System.out.println("1 - 더하기");
		System.out.println("2 - 빼기");
		System.out.println("3 - 곱하기");
		System.out.println("4 - 나누기");
		
		System.out.println("입력 :");
		int choiceNum = sc.nextInt();
		
		System.out.println("Number1 :" + number1);
		System.out.println("Number2 :" + number2);
		System.out.println("선택 -" + choiceNum);
		performSwitchIF(number1, number2, choiceNum);
	/*	
		if(choiceNum == 1 ) {
			System.out.println("결과 : " +(number1+number2));
		}else if(choiceNum == 2 ) {
			System.out.println("결과 : " +(number1-number2));
		}else if(choiceNum == 3 ) {
			System.out.println("결과 : " +(number1*number2));
		}else if(choiceNum == 4 ) {
			System.out.println("결과 : " +(number1/number2));
		}else {
			System.out.println("선택이 잘못되었습니다.");
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
			System.out.println("선택이 잘못되었습니다.");
			break;
		}
	}
	
}
