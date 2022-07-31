package udmy.act16.setList;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Ex1 {
	public static void main(String[] args) {
		TreeSet<Integer> number = new TreeSet<>(Set.of(65,53,34,12,99));
		
		System.out.println(number);
		// TreeSet은 값을 정렬된 상태로 저장한다.
	}
}
