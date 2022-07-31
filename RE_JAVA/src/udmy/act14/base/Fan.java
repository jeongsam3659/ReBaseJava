package udmy.act14.base;

public class Fan {
	//state
	private String make;
	private double radius;
	private String color;
	private Boolean isOn;
	private byte speed;
	
	//constructor ������
	public Fan(String make, double radius, String color) {
		//��ü�� �� �ʿ��Ѱɷ� ����.
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",make, radius, color, isOn, speed);
	}
	
	//isOn ���
	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}
	public void switchOn() {
		setSpeed((byte)5);
		this.isOn = true;
	}
	public void switchOff() {
		setSpeed((byte)0);
		this.isOn = false;
	}
	
	//speed
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
}
