package TestCos_another;
import java.util.Arrays;
public class Lv1_Q4_a {

	public class GetMean {
	    public int getMean(int[] array) {
	        return (int) Arrays.stream(array).average().orElse(0);
	    }
	//ó������ api�� ã�ƺ��Ҵ��� Array.stream()�� �� ����Ÿ���� IntStream Ŭ������ �ڹ�8���� �߰��� �����̳׿�
	}
}
