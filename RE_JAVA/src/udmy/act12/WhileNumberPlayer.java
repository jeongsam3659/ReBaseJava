package udmy.act12;

public class WhileNumberPlayer {
	
	private int limit;
	
	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
	// ���� 30����, ���- ������ 1, 4, 9, 16, 25
		int i = 1;
		while(i*i < limit) {
			System.out.print(i*i + " ");
			i++;
		}
		println();
	}

	public void printCubesUptoLimit() {
	// ���� 30, ���- �������� 1, 8, 27
		int i = 1;
		while(i*i*i < limit) {
			System.out.print(i*i*i + " ");
			i++;
		}
		println();
	}
	
	public void println() {
		System.out.println(" ");
	}
}
