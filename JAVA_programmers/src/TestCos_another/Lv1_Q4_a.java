package TestCos_another;
import java.util.Arrays;
public class Lv1_Q4_a {

	public class GetMean {
	    public int getMean(int[] array) {
	        return (int) Arrays.stream(array).average().orElse(0);
	    }
	//처음보는 api라서 찾아보았더니 Array.stream()과 그 리턴타입인 IntStream 클래스는 자바8에서 추가된 내용이네요
	}
}
