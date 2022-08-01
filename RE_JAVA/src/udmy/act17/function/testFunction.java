package udmy.act17.function;

import java.util.List;
import java.util.stream.IntStream;

public class testFunction {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		//1.  1~10���� ��� �� ���� ���
		IntStream.range(1, 11).forEach(p -> System.out.println(p));
		IntStream.range(1, 11).map(e -> e*e).forEach(e -> System.out.println(e));
		System.out.println("--- ���м� ---");
		
		//2. �ش� ����Ʈ�� ���� �ҹ��ڷ� ����.
		List<String> strTemp = List.of("Apple", "Ant", "Bat");
		strTemp.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));
		System.out.println("--- ���м� ---");
		
		
		//3. �� ��ҵ��� ���̸� ���.
		strTemp.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
	}

}
