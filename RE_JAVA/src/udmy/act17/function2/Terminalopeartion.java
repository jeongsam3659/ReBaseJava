package udmy.act17.function2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Terminalopeartion {

	public static void main(String[] args) {
		//Terminalopeartion 종단연산
		System.out.println(
				IntStream.range(1, 11).reduce(
						0, (n1,n2) ->n1+n2)
				);
		// Map한 값을 리스트형태로 구성.
		System.out.println(
				IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList())
				);

		List<Integer> numbers = List.of(23,12,34,53);
		System.out.println("-- Max / Min --");
		// 최대값 구하기
		System.out.println(numbers.stream().max((n1,n2) -> Integer.compare(n1, n2)));
		System.out.println(numbers.stream().max((n1,n2) -> Integer.compare(n1, n2)).get());
		// 최솟값 구하기
		System.out.println(numbers.stream().min((n1,n2) -> Integer.compare(n1, n2)).get());
		// 홀수,짝수 뽑아 리스트 구성
		System.out.println("-- 홀수 --");
		System.out.println(numbers.stream().filter(n -> n%2 ==1).collect(Collectors.toList()));
		System.out.println("-- 짝수 --");
		System.out.println(
				numbers.stream().filter(
						n -> n%2 == 0).collect(
								Collectors.toList()
								)
				);
		
		// 
		System.out.println("-- [] --");
		System.out.println(List.of(23,45,67,12).stream().filter(n -> n%2 ==0).max((n1,n2) -> Integer.compare(n1, n2)));
		
	}

}
