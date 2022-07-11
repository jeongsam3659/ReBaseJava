package udmy.act9.copy;

import java.math.BigDecimal;

public class SimpleCalculator {
	
	BigDecimal principal;
	BigDecimal interest;
	
	// principal ����
	// interest  ����
	// String���� �޴� ������ BigDecimal�� ��Ȯ���� �������⶧��.
	public SimpleCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));		
	}
	
	public BigDecimal calculateTotal(int year) {
		// ���� = ���� + ����*����*�⵵
		// total = principal + principal*interest*years
		BigDecimal total = principal.add(
				principal.multiply(
						interest).multiply(
								new BigDecimal(year)));
		return total;
	}
}
