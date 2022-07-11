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
		System.out.println(treeSet); // 중복 x , 정렬 o , 알파벳 순서를 제공.
		
		System.out.println("----------------------");
		
		Set<Character> linkedSet = new LinkedHashSet<>(characters);
		System.out.println(linkedSet); // 중복 x ,삽입순서를 제공.
		
		System.out.println("----------------------");
		
		Set<Character> HashSet = new HashSet<>(characters);
		System.out.println(HashSet); // 중복 x , 정렬 o
		
	}
}
