package udmy.act14.re;

public class RectangleRunner {
	public static void main(String [] args) {
		
		Rectangle R1 = new Rectangle(12, 23);
		System.out.println(R1);
		R1.setLength(25);
		R1.setWidth(16);
		
		System.out.println("------------");
		System.out.println(R1);
	}
}
