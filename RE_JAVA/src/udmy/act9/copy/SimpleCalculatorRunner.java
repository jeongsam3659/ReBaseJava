package udmy.act9.copy;

import java.math.BigDecimal;

public class SimpleCalculatorRunner {
	public static void main(String[] args) {
//		������ ���
//		 - ���� 4500.0
//		 - ������ 7.5%
//		 - ����Ⱓ 5��
//		 > ����Ⱓ�� ������ ��ü ������ ������ ���ϴ�

		SimpleCalculator calcultor = new SimpleCalculator("4500.00", "7.5");
		BigDecimal totalValue = calcultor.calculateTotal(5); // 5��
		System.out.println("����: "+totalValue);
		//����: 6187.50000

	}
}
