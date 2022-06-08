package udmy.act7;

public class Book {
	private int copies;

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
		this.copies+= 11;
	}
	
}
