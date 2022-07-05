package udmy.act15.re;

public class BookRunner {
	public static void main(String [] args) {
		
		Book book = new Book(123, "Programming with java","Ranga");
		
		System.out.println(book);
		book.addReview(new Review(10, "god Book", 5));
		book.addReview(new Review(98, "not bad", 4));
		
		System.out.println(" ");
		System.out.println(book);
	}
}
