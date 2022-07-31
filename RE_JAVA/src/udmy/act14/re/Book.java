package udmy.act14.re;

import java.util.ArrayList;

public class Book {
	//state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	//constructor
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	//operation
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format(
				"id =%d, name=%s, author=%s\n Reviews = [%s]"
				, id,name,author,reviews);
	}
}
