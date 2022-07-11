package udmy.act9.copy;

import java.math.BigDecimal;

public class SimpleCalculator {
	
	BigDecimal principal;
	BigDecimal interest;
	
	// principal 원금
	// interest  이자
	// String으로 받는 이유는 BigDecimal의 정확도가 떨어지기때문.
	public SimpleCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));		
	}
	
	public BigDecimal calculateTotal(int year) {
		// 총합 = 원금 + 원금*이자*년도
		// total = principal + principal*interest*years
		BigDecimal total = principal.add(
				principal.multiply(
						interest).multiply(
								new BigDecimal(year)));
		return total;
	}
}
