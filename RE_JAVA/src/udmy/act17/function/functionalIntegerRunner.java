package udmy.act17.function;

import java.util.List;

public class functionalIntegerRunner {

	public static void main(String[] args) {
		List<Integer> intList = List.of(11,33,44,55);
		
		// 1. int형 출력
		IntPrint(intList);
		// 2. 조건부 출력(홀수)
		IntFilterOdd(intList);
		// 3. 조건부 출력(짝수)
		IntFilterEven(intList);
	}

	private static void IntPrint(List<Integer> intList) {
		intList.stream().forEach(element -> System.out.println("element -int :" + element));
	}
	
	private static void IntFilterOdd(List<Integer> intList) {
		intList.stream().filter(
				element -> element%2 == 1).forEach(
						element -> System.out.println("홀수 :"+element)
						);
	}
	
	private static void IntFilterEven(List<Integer> intList) {
		intList.stream().filter(
				element -> element%2 == 0).forEach(
						element -> System.out.println("짝수 :"+element)
						);
	}


}
