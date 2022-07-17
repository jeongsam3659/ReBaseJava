package udmy.act18;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
//public class MyCustomList<T>
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T i) {
		list.add(i);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
	public T get(int index) {
		return list.get(index);
	}
}


// class�� <T> << ���ʸ��� ���̰�
// ArrayList<T> << ���� ���ʸ��� ���δ�.

// RunnerŬ���� �����ڿ��� <T>�� ���δ�.
//-----------------------------------------

// Ŭ������ ���� ������ Ư���ϴ� ����
// �Ϲ������� ��� ������ Ư���ϵ� �� ��� ��ġ���� T�� �� �� �ִ�.
//-----------------------------------------
// <T extends Number>���� MyCustomList�� ���ڸ� ����ϰԲ� �� �� �ִ�.