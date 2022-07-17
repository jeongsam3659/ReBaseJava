package udmy.act18;

public class GenericsRunner {

	
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
	}
}
