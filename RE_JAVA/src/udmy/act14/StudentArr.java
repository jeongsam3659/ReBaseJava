package udmy.act14;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentArr {
	private String name;
	private int[] marks;
	
	public StudentArr(String name,int[] marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public int getNumberOfMarks() {
		// 배열의 크기.
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		// 배열의 값 총합.
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// 배열 최대화.
		int maximum = Integer.MIN_VALUE;
		for(int mark : marks) {
			if(mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		// 배열 최소화.
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		// 평균.
		int sum = getTotalSumOfMarks();
		int num = getNumberOfMarks();

//		return new BigDecimal(sum/num);
		return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
		// 더 정확한 값을 구할 수 있다.
		// precision (3)로 소수점(셋째자리)을 조절할 수있따.
	}
	
	
}
