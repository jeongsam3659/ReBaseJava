package udmy.act7;

public class MotorBike {

	//state
	 private int speed;

	//name
	void setSpeed(int speed) {
		// 지역변수 local variable
		if(speed > 0) {
			this.speed = speed;
		}

	}
	
	public int getSpeed() {
		return speed;
	}

	// 행동 behavior
	void start() {
		System.out.println("출발!");
	}
	

}
