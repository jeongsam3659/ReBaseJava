package udmy.act9.copy;

import java.math.BigDecimal;

public class SimpleCalculatorRunner {
	public static void main(String[] args) {
//		이자율 계산
//		 - 원금 4500.0
//		 - 이자율 7.5%
//		 - 대출기간 5년
//		 > 대출기간이 끝나고 전체 이익은 얼마일지 구하는

		SimpleCalculator calcultor = new SimpleCalculator("4500.00", "7.5");
		BigDecimal totalValue = calcultor.calculateTotal(5); // 5년
		System.out.println("총합: "+totalValue);
		//총합: 6187.50000

	}
}
