package TestCos;

class Solution {
    public long[] solution(int x, int n) {
	    long[] answer = new long[n];
        
        long Xre = x;
	
	    for(int i=0; i<answer.length; i++) {
		    answer[i] = Xre;
		    Xre += x;
	    }
        
        return answer;
       
    }
}

public class Lv1_Q6 {
	public static void main(String [] args) {
		Solution sol = new Solution();
		sol.solution(2, 5);
		

	}
}
