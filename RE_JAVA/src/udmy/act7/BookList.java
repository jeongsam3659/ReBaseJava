package udmy.act7;

public class BookList {
	public static void main(String [] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
			
		
		artOfComputerProgramming.setCopies(100);
		effectiveJava.setCopies(50);
		cleanCode.setCopies(30);
		
		int artCost, javaCost, cleanCost;
		artCost = artOfComputerProgramming.getCopies();
		javaCost = effectiveJava.getCopies();
		cleanCost = cleanCode.getCopies();
		
		System.out.printf("artOf...ing: %d\n Eff..Java: %d\n CleanCode: %d ¿‘¥œ¥Ÿ.",artCost,javaCost,cleanCost);
	}
}
