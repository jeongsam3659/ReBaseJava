package udmy.act7;

public class MotorBikeRunner {
	
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		// MotorBike���� private�� ������ ������ �߻��Ѵ�.
		ducati.setSpeed(100);
		
		//System.out.println(ducati.getSpeed());
		//honda.setSpeed(80);
		//System.out.println(honda.getSpeed());
		//ducati.setSpeed(20);
		//honda.setSpeed(0); 		
	}

}
