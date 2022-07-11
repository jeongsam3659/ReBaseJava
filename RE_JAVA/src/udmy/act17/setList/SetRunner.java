package udmy.act17.setList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[]args) {
		List<Character> characters = List.of('A','Z','A','B','F');
		// unique -Set , Tree, Hash, LinkedHash
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet); // �ߺ� x , ���� o , ���ĺ� ������ ����.
		
		System.out.println("----------------------");
		
		Set<Character> linkedSet = new LinkedHashSet<>(characters);
		System.out.println(linkedSet); // �ߺ� x ,���Լ����� ����.
		
		System.out.println("----------------------");
		
		Set<Character> HashSet = new HashSet<>(characters);
		System.out.println(HashSet); // �ߺ� x , ���� o
		
	}
}
