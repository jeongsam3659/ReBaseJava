package udmy.act13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArr {
	private String name;
//	private int[] marks; 
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	
	
//	public StudentArr(String name,int[] marks) {
//		this.name = name;
//		this.marks = marks;
//	}
	public StudentArr(String name,int... marks) {
		// ����
		this.name = name;
//		this.marks = marks;
		for(int mark: marks) {
			this.marks.add(mark); // ArrayList �߰�
		}
	}
	
	
	public int getNumberOfMarks() {
		// �迭�� ũ��.
		//return marks.length;
		return marks.size();
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
//		// �迭 �ִ�ȭ.
//		int maximum = Integer.MIN_VALUE;
//		for(int mark : marks) {
//			if(mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		// �迭 �ּ�ȭ.
//		int minimum = Integer.MAX_VALUE;
//		for(int mark : marks) {
//			if(mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;
		return Collections.min(marks);
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


//ArrayList	
	@Override
	public String toString() {
		// String ����� ����ϱ�.
		return name + marks;
	}
	
	public void addNewMark(int mark) {
		marks.add(mark);	
	}


	public void removeMarkIndex(int index) {
		marks.remove(index);
	}
	
	
}
