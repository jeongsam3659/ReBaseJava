package udmy.act7.copy;

public class BookList {
	public static void main(String [] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.setCopies(22);
		artOfComputerProgramming.plusCopies(10);
		System.out.println(artOfComputerProgramming.getCopies());
	}
}
