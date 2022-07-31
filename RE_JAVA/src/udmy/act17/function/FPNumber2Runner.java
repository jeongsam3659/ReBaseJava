package udmy.act17.function;

import java.util.List;

public class FPNumber2Runner {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(3,5,8,213,45,4,7);
		// .sorted() ����
		System.out.println("--- ���� ---");
		numbers.stream().sorted().forEach(e -> System.out.println(e));
		
		List<Integer> number2s = List.of(3,5,3,213,45,5,7);
		// .distinct() �ߺ� ����
		System.out.println("--- �ߺ����� ---");
		number2s.stream().distinct().forEach(e -> System.out.println(e));
		// �ߺ����� + ����
		number2s.stream().distinct().sorted().forEach(e -> System.out.println(e));
		
		// map() ���� (�ش� �� ����) 
		System.out.println("--- map�� ---");
		number2s.stream().distinct().sorted().map(e -> e*e).forEach(e -> System.out.println(e));
	
	}
}
