package udmy.act14.base;

public class FanRunner {
	public static void main(String [] args) {
		Fan fan = new Fan("�ݼ�",65.33,"white");
		System.out.println(fan.toString());
		fan.switchOn();
		System.out.println(fan.toString());
	}
}
