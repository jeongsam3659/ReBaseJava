package udmy.act16.setList;

import java.util.Set;
import java.util.TreeSet;

public class TeeSet_num {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,52,34,12,99));
		
		// �ش� ���ں��� ���� ���� ����.
		System.out.println(numbers.floor(40));
		
		// �ش� ���ں��� ū ���� ����.
		System.out.println(numbers.ceiling(40));
		
		// ���� ���� ������ �ش� ���� ����.
		System.out.println(numbers.floor(34));
		
		// �ش� ������ ������ ���� ��.
		System.out.println(numbers.lower(34));
		
		// �ش� ������ ������ ū ��.
		System.out.println(numbers.higher(34));
		
		// �ش� �� ������ ���� �����´�.
		System.out.println(numbers.subSet(20, 80));
		
		// >= <=
		System.out.println(numbers.subSet(34,true, 65,true));
		
		// �ش� ������ �迭�� ���� ǥ��.
		System.out.println(numbers.headSet(50));
		
		// �ش� �������� �迭�� ���� ǥ��.
		System.out.println(numbers.tailSet(50));
	}
}
