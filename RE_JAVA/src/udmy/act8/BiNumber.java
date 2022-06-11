package udmy.act8;

public class BiNumber {
	//
	private int Number1, Number2;
	
	public int getNumber1() {
		return Number1;
	}
	public void setNumber1(int number1) {
		Number1 = number1;
	}
	public int getNumber2() {
		return Number2;
	}
	public void setNumber2(int number2) {
		Number2 = number2;
	}
	
	//생성자
	BiNumber(){}
	public BiNumber(int i, int j) { //****** 중요.
		this.Number1 = i;
		this.Number2 = j;
	}
	
	//ACTIVE
	public int add(){
		int sum = Number1 + Number2;
		return sum;
	}
	
	public int multi() {
		return Number1  * Number2;
	}
	
	public void doubleValue() {
		this.Number1 *=2;
		this.Number2 *=2;
	}
}


/*
 * 
 	public void add(){
		int addSc = (Number1 + Number2);
		System.out.println("두 수의 합: "+addSc);
	}
	
	public void multi() {
		int multiSc = (Number1*Number2);
		System.out.println("두 수의 곱: "+multiSc);
	}
	
	public void double2() {
		this.Number1 *=2;
		this.Number2 *=2;
	}
 * 
 * 
 * 
 * 
 * */
