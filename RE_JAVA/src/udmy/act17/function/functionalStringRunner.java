package udmy.act17.function;

import java.util.List;

public class functionalStringRunner {

	public static void main(String[] args) {
		// 1. List ����
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		
		printBasic(list);
		printFuntion(list);
		//
		printFilter(list);
		printFuntionFilter(list);
		
		
	}

	// 1. ����Ʈ ���
	// ���� -> Refactor -> extract method
	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	// 2. ���� ��ҵ��� ���� �帧���� ��ȯ��Ŵ
	private static void printFuntion(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
		// action = �ൿ = �޼ҵ� = ��Ҹ� ���� �������� ����ϴ°�.
		// -> ����
	}
	// 3. ���͸� Ȱ���� ����.
	private static void printFilter(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	// 4. �Լ��� ���͸� Ȱ��.
	private static void printFuntionFilter(List<String> list) {
		list.stream().filter(
				element -> element.endsWith("at")
				).forEach(
						element -> System.out.println(element)
						);
	}
	
	
	

}
