package udmy.act7.copy;

public class MotorBikeRunner {
	
	public static void main(String[] args) {
		// 생성자 활용.
//		MotorBike ducati = new MotorBike();
		MotorBike ducati = new MotorBike(100);
//		MotorBike honda = new MotorBike();
		MotorBike honda = new MotorBike(300);
		

		
		ducati.start();
		honda.start();
		
		// MotorBike에서 private로 설정시 오류가 발생한다.
		ducati.setSpeed(100);
		
		//2
		ducati.increaseSpeed(100);
		honda.increaseSpeed(50);
		
		ducati.decreaseSpeec(40);
		honda.decreaseSpeec(50);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
	
	}

}

// //2
//int ducatiSpeed = ducati.getSpeed();
//ducatiSpeed = ducatiSpeed + 100;
//ducati.setSpeed(ducatiSpeed);
//
//int hondaSpeed = honda.getSpeed();
//hondaSpeed = hondaSpeed + 50;
//honda.setSpeed(hondaSpeed);
