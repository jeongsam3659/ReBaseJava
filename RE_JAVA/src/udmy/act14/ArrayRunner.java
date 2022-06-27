package udmy.act14;

import java.util.Arrays;

public class ArrayRunner {
	public static void main(String[] args) {
		// 배열 기본 구성.
		int [] masks = {1,2,3};
		for(int mark:masks) {
			System.out.println(mark);
		}
		
		// 기본값 설정.
		int [] tmp = new int[4];
		Arrays.fill(tmp, 100);
		for(int tmps:tmp) {
			System.out.print(tmps);
		}
		System.out.println("");
		
		// 정렬.
		int [] sortTmp = {80, 60, 90};
		Arrays.sort(sortTmp);
		for(int sorts:sortTmp) {
			System.out.print(sorts);
		}
		
		
	}
}
