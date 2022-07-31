package udmy.act14.re;

public class Review {
//Book class
	
	private int id;
	private String description;
	private int rating;
	
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	public String toString() {
		return id + ") "+ description + " "+ rating +" ";
	}
}
