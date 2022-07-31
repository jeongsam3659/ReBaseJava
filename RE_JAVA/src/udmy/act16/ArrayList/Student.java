package udmy.act16.ArrayList;

public class Student implements Comparable<Student>{
	//state
	private int id;
	private String name;
	
	//constructer
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return id + " : " + name;
	}

	@Override //compare
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id);
							 //that.id, this.id 역순 정렬
	}
	
}
