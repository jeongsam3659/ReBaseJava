package TestCos_another;
import java.util.*;

class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

public class Lv1_Q6_a {
	public static void main(String[] args) {
	

	}

}
