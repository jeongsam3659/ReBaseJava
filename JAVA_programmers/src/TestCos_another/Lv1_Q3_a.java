package TestCos_another;

public class Lv1_Q3_a {
	// 1
	 public long solutionA(int a, int b) {
	        return sumAtoB(Math.min(a, b), Math.max(b, a));
	    }

	 private long sumAtoB(long a, long b) { // 등차수열 합 공식
	        return (b - a + 1) * (a + b) / 2;
	   	}
	// end 1
	 
	// 2
	 public long solutionB(int a, int b) {
	      long answer = 0;
	      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
	          answer += i;

	      return answer;
	  }
	 
	// end 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
