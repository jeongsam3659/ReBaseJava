package udmy.act14;

import java.math.BigDecimal;

public class StudentArrRunner {
	public static void main(String[] args) {
		// 154
		//int[] marks = {97, 87, 99};
		//StudentArr stArr = new StudentArr("Regular", marks);
		
		StudentArr stArr = new StudentArr("Ranga", 97, 98,100);
		StudentArr stArr1 = new StudentArr("Adam", 88, 77);
		StudentArr stArr2 = new StudentArr("Eve", 66, 87,76,100);
		
		int number = stArr.getNumberOfMarks();
		System.out.println("배열의 크기: "+number);
		
		int sum = stArr.getTotalSumOfMarks();
		System.out.println("배열값 총합: "+sum);
		
		int maxMark = stArr.getMaximumMark();
		System.out.println("배열값 최대값: "+maxMark);
		
		int minMark = stArr.getMinimumMark();
		System.out.println("배열값 최소값: "+minMark);
		
		BigDecimal avr = stArr.getAverageMarks();
		System.out.println("배열의 평균: "+avr);
		
		
		stArr.addNewMark(35);
		System.out.println("35 추가 상태 :"+stArr);
		stArr.removeMarkIndex(1);
		System.out.println("(1)제거 상태 :"+stArr);
	}
}
