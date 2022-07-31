package udmy.act14.re;

public class Rectangle {
	//state
	private int length;
	private int width;
	
	//constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	//operation
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	//면적
	public int area() {
		return length * width;
	}
	
	//둘레
	public int perimetor() {
		return 2* (length+width);
	}

	
	//
	public String toString() {
		return String.format("width - %d\n length - %d\n area - %d\n perimetor - %d",
				length,width,area(),perimetor());
		
		
	}

}
