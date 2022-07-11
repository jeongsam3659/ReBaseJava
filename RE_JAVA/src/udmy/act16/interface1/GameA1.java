package udmy.act16.interface1;

public class GameA1 implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up going");
	}

	@Override
	public void down() {
		System.out.println("down going");
	}

	@Override
	public void left() {
		System.out.println("left going");

	}

	@Override
	public void right() {
		System.out.println("right going");

	}

}
