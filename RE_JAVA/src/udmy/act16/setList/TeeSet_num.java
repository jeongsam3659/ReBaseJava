package udmy.act16.setList;

import java.util.Set;
import java.util.TreeSet;

public class TeeSet_num {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,52,34,12,99));
		
		// 해당 숫자보다 작은 수를 추출.
		System.out.println(numbers.floor(40));
		
		// 해당 숫자보다 큰 수를 추출.
		System.out.println(numbers.ceiling(40));
		
		// 만일 값과 같으면 해당 값을 추출.
		System.out.println(numbers.floor(34));
		
		// 해당 수보다 무조건 작은 값.
		System.out.println(numbers.lower(34));
		
		// 해당 수보다 무조건 큰 값.
		System.out.println(numbers.higher(34));
		
		// 해당 수 범위내 값을 가져온다.
		System.out.println(numbers.subSet(20, 80));
		
		// >= <=
		System.out.println(numbers.subSet(34,true, 65,true));
		
		// 해당 수까지 배열의 수를 표현.
		System.out.println(numbers.headSet(50));
		
		// 해당 수이후의 배열의 수를 표현.
		System.out.println(numbers.tailSet(50));
	}
}
