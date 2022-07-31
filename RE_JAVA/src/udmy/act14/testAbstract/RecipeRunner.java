package udmy.act14.testAbstract;

public class RecipeRunner {
	public static void main(String []args) {
		Recipe1 r1 = new Recipe1();
		
		r1.extra();		
	//		r1.getReady();
	//		r1.doTheDish();
	//		r1.cleanUp();
		
		Recipe2 r2 = new Recipe2();
		r2.extra();
		
	}
}
