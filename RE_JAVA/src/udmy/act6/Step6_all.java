package udmy.act6;

public class Step6_all {
	void printMult() {
		for(int i=2; i<10; i++) {
			System.out.printf(" ======\n - %d´Ü - \n ======",i).println();
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d",i, j, i*j).println();
			}
		}
	}
}
