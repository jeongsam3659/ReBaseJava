package udmy.act11;

import java.util.Scanner;

public class DowhileLoopRunner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		do {
			if(number != -1) {
				System.out.println("세제곱은 : "+(number*number*number));
			}
			System.out.println("숫자를 입력하세요: ");
			number = sc.nextInt();
			
		}while(number >= 0);
		System.out.println("루프를 종료합니다. ^^");
		
	}
}
