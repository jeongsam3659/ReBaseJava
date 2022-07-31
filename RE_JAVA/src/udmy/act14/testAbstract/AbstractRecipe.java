package udmy.act14.testAbstract;

public abstract class AbstractRecipe {
	public void extra() {
		getReady();
		doTheDish();
		cleanUp();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();
}
