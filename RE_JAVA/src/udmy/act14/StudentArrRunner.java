package udmy.act14;

import java.math.BigDecimal;

public class StudentArrRunner {
	public static void main(String[] args) {
		// 154
		int[] marks = {97, 87, 99};
		StudentArr stArr = new StudentArr("Regular", marks);
		
		int number = stArr.getNumberOfMarks();
		System.out.println("�迭�� ũ��: "+number);
		
		int sum = stArr.getTotalSumOfMarks();
		System.out.println("�迭�� ����: "+sum);
		
		int maxMark = stArr.getMaximumMark();
		System.out.println("�迭�� �ִ밪: "+maxMark);
		
		int minMark = stArr.getMinimumMark();
		System.out.println("�迭�� �ּҰ�: "+minMark);
		
		BigDecimal avr = stArr.getAverageMarks();
		System.out.println("�迭�� ���: "+avr);
		
		
		
		
	
	}
}
