package udmy.act8;

public class numberRun {
	public static void main(String [] args) {
		BiNumber numbers = new BiNumber(4,3);
		
		System.out.println("�� ���� ��: "+numbers.add());;
		System.out.println("�� ���� ��: "+numbers.multi());
		numbers.doubleValue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}
}
