package udmy.act17.function;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(4,5,7,8,22,44);
		
		// 함수형 프로그램밍을 활용한 숫자,리스트의 총합 구하기.
		int sumList = sumList(numbers);
		// 함수형 프로그래밍을 활용한 홀수값만 총합.
		int sumODDList = sumODDList(numbers);
		
		System.out.println(sumList);
		System.out.println(sumODDList);
	}

	private static int sumList(List<Integer> numbers) {
		return numbers.stream().reduce(
				0, (number1, number2) -> number1+number2);
	}
	
	private static int sumODDList(List<Integer> numbers) {
		return numbers.stream().filter(
				number -> number%2 == 1
				).reduce(0, (number1,number2) -> number1+number2);
	}

	
}
