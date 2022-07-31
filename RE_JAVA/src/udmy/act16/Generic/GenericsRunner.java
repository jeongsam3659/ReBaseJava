package udmy.act16.Generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		//메서드를 가지고 제너릭을 만들기.
		//<X> 종류의 값을 받아들이고 같은 종류의 값을 반환.
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		// 리스트를 연장
		list.addAll(list);
	}
	
	//와일드카드
	static double sumOfNumberList(List<? extends Number> numbers) {
		// ? == 와일드카드
		// 숫자클래스를 연장하는 아무 리스트 재현.
		double sum = 0.0;
		for(Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;
		//상한 경계 와일드 카드.
	}
	
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
		//하한 경계 와일드 카드.
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
		
//		숫자를 이용한 리스트를 만들다는 가정.
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		// 하지만 에러가 발생
		// MyCustomList는 <String>이기때문에 문자열만 사용.
		// 한 종류에 묶이지 않고 구현하기.
		Integer number = list2.get(0);// 특정메서드에 추출.
		System.out.println(list2);
		System.out.println(number);
		
		
		// 제한이 없는 
		String strValue = doubleValue(new String()); // 문자열
		Integer intNumber = doubleValue(Integer.valueOf(5)); // 정수
		ArrayList arrValue = doubleValue(new ArrayList()); // 배열 리스트
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
		duplicate(numbers);
		System.out.println(numbers); //[1,2,3,1,2,3]
		
		LinkedList<Integer> numberss = new LinkedList<>(List.of(1,2,3));
		duplicate(numberss);
		System.out.println(numberss);
		
		
		// 상한
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5))); 
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l))); //Long
	
		// 하한
		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
	}
}
