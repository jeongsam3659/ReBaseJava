package udmy.act14.testAbstract;

public class Recipe2 extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("��� �غ�");
		System.out.println("�ϵϽ��");
		
	}

	@Override
	void doTheDish() {
		System.out.println("������ ��.");
		System.out.println("�ڽ� �ڽ� �ڽäӤ�");
		
	}

	@Override
	void cleanUp() {
		System.out.println("û�� �ϴ�.");
		System.out.println("��Ʃ��ƩȨ��Ʃ");
		
	}

}
