package udmy.act14.testAbstract;

public class Dogs extends Animal {

	@Override
	void bork() {
		System.out.println("wall wall");
	}
	
	public static void main(String [] args) {
		Dogs dog = new Dogs();
		dog.bork();
	}
	
}
