package udmy.act7;

public class MotorBike {

	//state
	 private int speed;

	//name
	void setSpeed(int speed) {
		// �������� local variable
		System.out.println(speed); // 100
		System.out.println(this.speed); // 0
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	// �ൿ behavior
	void start() {
		System.out.println("���!");
	}
	

}
