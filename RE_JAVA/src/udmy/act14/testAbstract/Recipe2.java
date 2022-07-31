package udmy.act14.testAbstract;

public class Recipe2 extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("Àç·á ÁØºñ");
		System.out.println("½ÏµÏ½âµÏ");
		
	}

	@Override
	void doTheDish() {
		System.out.println("¼³°ÅÁö Áß.");
		System.out.println("µÚ½Ã µÚ½Ã µÚ½Ã¤Ó¤Ó");
		
	}

	@Override
	void cleanUp() {
		System.out.println("Ã»¼Ò ÇÏ´Ù.");
		System.out.println("¸ÞÆ©¸ÞÆ©È¨¸ÅÆ©");
		
	}

}
