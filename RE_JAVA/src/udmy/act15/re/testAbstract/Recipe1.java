package udmy.act15.re.testAbstract;

public class Recipe1 extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("��� �غ�");
		System.out.println("��� �ս�");
		
	}

	@Override
	void doTheDish() {
		System.out.println("������ ��.");
		
	}

	@Override
	void cleanUp() {
		System.out.println("û�� �ϴ�.");
		
	}

}
