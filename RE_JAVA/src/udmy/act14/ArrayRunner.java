package udmy.act14;

import java.util.Arrays;

public class ArrayRunner {
	public static void main(String[] args) {
		// �迭 �⺻ ����.
		int [] masks = {1,2,3};
		for(int mark:masks) {
			System.out.println(mark);
		}
		
		// �⺻�� ����.
		int [] tmp = new int[4];
		Arrays.fill(tmp, 100);
		for(int tmps:tmp) {
			System.out.print(tmps);
		}
		System.out.println("");
		
		// ����.
		int [] sortTmp = {80, 60, 90};
		Arrays.sort(sortTmp);
		for(int sorts:sortTmp) {
			System.out.print(sorts);
		}
		
		
	}
}
