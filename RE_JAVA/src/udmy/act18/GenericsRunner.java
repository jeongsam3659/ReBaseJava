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
	}
}
