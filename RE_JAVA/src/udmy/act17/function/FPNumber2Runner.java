package udmy.act17.function;

import java.util.List;

public class FPNumber2Runner {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(3,5,8,213,45,4,7);
		// .sorted() 정렬
		System.out.println("--- 정렬 ---");
		numbers.stream().sorted().forEach(e -> System.out.println(e));
		
		List<Integer> number2s = List.of(3,5,3,213,45,5,7);
		// .distinct() 중복 제거
		System.out.println("--- 중복제거 ---");
		number2s.stream().distinct().forEach(e -> System.out.println(e));
		// 중복제거 + 정렬
		number2s.stream().distinct().sorted().forEach(e -> System.out.println(e));
		
		// map() 형태 (해당 값 제곱) 
		System.out.println("--- map핑 ---");
		number2s.stream().distinct().sorted().map(e -> e*e).forEach(e -> System.out.println(e));
	
	}
}
