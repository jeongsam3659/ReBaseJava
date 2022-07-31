package udmy.act16.setList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}
	// 글자수 순서대로 출력 // Cat 3, Zebra  5, Monkey 6
}

public class QueueSet {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		
		System.out.println(queue.poll()); // Queue에서 하나씩 꺼냄.
		System.out.println(queue.poll()); // 들어간 순서대로 꺼냄.
		System.out.println(queue.poll()); // 값이 없을경우 Null
		System.out.println(queue.poll());
	}
}
