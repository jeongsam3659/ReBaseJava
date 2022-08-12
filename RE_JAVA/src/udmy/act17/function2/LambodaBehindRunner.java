package udmy.act17.function2;

import java.util.List;
import java.util.function.Predicate;

//filter
class EvenNumberPredicate implements Predicate<Integer>{
	// 짝수
	@Override
	public boolean test(Integer number) {
		return number%2 ==0;
	}	
}

public class LambodaBehindRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(23,43,34,45,36,48);
		numbers.stream()
			.filter(n -> n%2 == 1)
			.forEach(n -> System.out.println(n));
		
		System.out.println(" -- 구분 선 --");
		
		// filter
		List<Integer> number2 = List.of(22,55,43,32,56);
		numbers.stream()
			.filter(new EvenNumberPredicate())
			.forEach(n -> System.out.println(n));
		
		System.out.println(" -- 구분 선 --");
		
		// foreach
		

	}

}
