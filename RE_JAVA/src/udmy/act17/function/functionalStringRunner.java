package udmy.act17.function;

import java.util.List;

public class functionalStringRunner {

	public static void main(String[] args) {
		// 1. List 생성
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		
		printBasic(list);
		printFuntion(list);
		//
		printFilter(list);
		printFuntionFilter(list);
		
		
	}

	// 1. 리스트 출력
	// 구역 -> Refactor -> extract method
	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	// 2. 내부 요소들은 값을 흐름으로 변환시킴
	private static void printFuntion(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
		// action = 행동 = 메소드 = 요소를 각자 가져가서 사용하는것.
		// -> 람다
	}
	// 3. 필터를 활용한 추출.
	private static void printFilter(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	// 4. 함수적 필터를 활용.
	private static void printFuntionFilter(List<String> list) {
		list.stream().filter(
				element -> element.endsWith("at")
				).forEach(
						element -> System.out.println(element)
						);
	}
	
	
	

}
