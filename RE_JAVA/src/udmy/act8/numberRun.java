package udmy.act8;

public class numberRun {
	public static void main(String [] args) {
		BiNumber numbers = new BiNumber(4,3);
		
		System.out.println("두 수의 합: "+numbers.add());;
		System.out.println("두 수의 곱: "+numbers.multi());
		numbers.doubleValue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}
}
