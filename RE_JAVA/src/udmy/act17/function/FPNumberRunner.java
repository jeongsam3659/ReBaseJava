package udmy.act17.function;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(4,5,7,8,22,44);
		
		// �Լ��� ���α׷����� Ȱ���� ����,����Ʈ�� ���� ���ϱ�.
		int sumList = sumList(numbers);
		// �Լ��� ���α׷����� Ȱ���� Ȧ������ ����.
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
