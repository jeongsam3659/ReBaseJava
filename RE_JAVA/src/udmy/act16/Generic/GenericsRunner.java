package udmy.act16.Generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		//�޼��带 ������ ���ʸ��� �����.
		//<X> ������ ���� �޾Ƶ��̰� ���� ������ ���� ��ȯ.
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		// ����Ʈ�� ����
		list.addAll(list);
	}
	
	//���ϵ�ī��
	static double sumOfNumberList(List<? extends Number> numbers) {
		// ? == ���ϵ�ī��
		// ����Ŭ������ �����ϴ� �ƹ� ����Ʈ ����.
		double sum = 0.0;
		for(Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;
		//���� ��� ���ϵ� ī��.
	}
	
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
		//���� ��� ���ϵ� ī��.
	}
	
	public static void main(String[] args) {
/*
 		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element1");
		list.addElement("Element2");
		String value = list.get(0); 
*/		
		MyCustomList<Long> list = new MyCustomList<>();
		list.addElement((long) 51);
		list.addElement((long) 72);
		Long value = list.get(0);
		
		System.out.println(list);
		System.out.println(value);
		
//		���ڸ� �̿��� ����Ʈ�� ����ٴ� ����.
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		// ������ ������ �߻�
		// MyCustomList�� <String>�̱⶧���� ���ڿ��� ���.
		// �� ������ ������ �ʰ� �����ϱ�.
		Integer number = list2.get(0);// Ư���޼��忡 ����.
		System.out.println(list2);
		System.out.println(number);
		
		
		// ������ ���� 
		String strValue = doubleValue(new String()); // ���ڿ�
		Integer intNumber = doubleValue(Integer.valueOf(5)); // ����
		ArrayList arrValue = doubleValue(new ArrayList()); // �迭 ����Ʈ
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
		duplicate(numbers);
		System.out.println(numbers); //[1,2,3,1,2,3]
		
		LinkedList<Integer> numberss = new LinkedList<>(List.of(1,2,3));
		duplicate(numberss);
		System.out.println(numberss);
		
		
		// ����
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5))); 
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l))); //Long
	
		// ����
		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
	}
}
