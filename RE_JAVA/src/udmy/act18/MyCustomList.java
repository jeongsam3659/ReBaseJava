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


// class명 <T> << 제너릭을 붙이고
// ArrayList<T> << 에도 제너릭을 붙인다.

// Runner클래스 생성자에도 <T>을 붙인다.
//-----------------------------------------

// 클래스의 변수 종류를 특정하는 순간
// 일반적으로 어디서 종류를 특정하든 그 모든 위치에서 T를 쓸 수 있다.
//-----------------------------------------
// <T extends Number>으로 MyCustomList는 숫자만 사용하게끔 할 수 있다.