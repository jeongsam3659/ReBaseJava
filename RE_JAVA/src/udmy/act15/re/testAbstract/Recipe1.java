package udmy.act15.re.testAbstract;

public class Recipe1 extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("재료 준비");
		System.out.println("재료 손실");
		
	}

	@Override
	void doTheDish() {
		System.out.println("설거지 중.");
		
	}

	@Override
	void cleanUp() {
		System.out.println("청소 하다.");
		
	}

}
