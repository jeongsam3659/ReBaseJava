package udmy.act7;

public class MotorBike {

	//state
	 private int speed;
	 
	//������
	MotorBike(){
		// ����ϴ� �ʿ��� ����Ʈ���� �ۼ��� ������ �߻��ϹǷ�
		// ����Ʈ�� �����ڵ� ������ش�. 
		// ����Ʈ���� �⺻������ 0������ this�� Ȱ���Ͽ� ����.
		this(5); // ����Ʈ��
	}
	MotorBike(int speed){
		this.speed = speed;
	}
	 

	//name
	void setSpeed(int speed) {
		// �������� local variable
		if(speed > 0) {
			this.speed = speed;
		}

	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void increaseSpeed(int howMuch) {
		// ĸ��ȭ 
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeec(int howMuch) {
		if(this.speed - howMuch > 0) {
			this.speed -= howMuch;
		}
	}

	// �ൿ behavior
	void start() {
		System.out.println("���!");
	}
	
}
