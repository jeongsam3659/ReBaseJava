package udmy.act16.interface3;

interface Flyable{
	void fly();
}

class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("with wings");
	}
	
}

class Aeroplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("with fuel");
	}
	
}

public class FlyRunner {
	public static void main(String[] args) {
		Flyable[] flyObjects = {new Bird(), new Aeroplane()};
		
		for(Flyable object: flyObjects) {
			object.fly();
		}
	}
}
