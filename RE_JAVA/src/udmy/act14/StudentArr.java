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
		// �迭�� ũ��.
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		// �迭�� �� ����.
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// �迭 �ִ�ȭ.
		int maximum = Integer.MIN_VALUE;
		for(int mark : marks) {
			if(mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		// �迭 �ּ�ȭ.
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		// ���.
		int sum = getTotalSumOfMarks();
		int num = getNumberOfMarks();

//		return new BigDecimal(sum/num);
		return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
		// �� ��Ȯ�� ���� ���� �� �ִ�.
		// precision (3)�� �Ҽ���(��°�ڸ�)�� ������ ���ֵ�.
	}
	
	
}