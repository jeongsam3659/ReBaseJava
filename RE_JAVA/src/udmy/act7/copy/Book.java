package udmy.act7.copy;

public class Book {
	private int copies;

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		if (copies > 0) { //양수를 구분짓고 저장.
			this.copies = copies;
		}
	}

	public void plusCopies(int count) {
		//this.copies += count;
		setCopies(this.copies + count);
	}
	
	public void minusCopies(int count) {
		setCopies(this.copies - count);
	}
}
