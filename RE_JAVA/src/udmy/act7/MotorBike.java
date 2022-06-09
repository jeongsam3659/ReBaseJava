package udmy.act7;

public class MotorBike {

	//state
	 private int speed;
	 
	//생성자
	MotorBike(){
		// 사용하는 쪽에서 디폴트상태 작성시 오류가 발생하므로
		// 디폴트형 생성자도 만들어준다. 
		// 디폴트값은 기본적으로 0이지만 this로 활용하여 지정.
		this(5); // 디폴트값
	}
	MotorBike(int speed){
		this.speed = speed;
	}
	 

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
	
	public void increaseSpeed(int howMuch) {
		// 캡슐화 
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeec(int howMuch) {
		if(this.speed - howMuch > 0) {
			this.speed -= howMuch;
		}
	}

	// 행동 behavior
	void start() {
		System.out.println("출발!");
	}
	
}
