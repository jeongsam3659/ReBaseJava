package udmy.act19.Exception;

//class Amout, String , int , 생성자, toString/return int , String, 
//add(Amount other) this.amont
class Amount{
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}

//RuntimeException
//	public void add(Amount that){
//		if(!this.currency.equals(that.currency)) {
//			throw new RuntimeException("현재 통화가 맞지 않습니다.");
//		}
//		
//		this.amount = this.amount +that.amount;
//	}

//Exception
//	public void add(Amount that)throws Exception{
//		if(!this.currency.equals(that.currency)) {
//			throw new Exception("현재 통화가 맞지 않습니다.");
//		}
//		
//		this.amount = this.amount +that.amount;
//	}
//}
	
	public void add(Amount that){
		if(!this.currency.equals(that.currency)) {
			throw new Stay_DoNotMatchExceptions("[오류] Stay_DoNotMatchExceptions 맞지않은 분류입니다.");
		}
		
		this.amount = this.amount +that.amount;
	}
}


class Stay_DoNotMatchExceptions extends RuntimeException{
	Stay_DoNotMatchExceptions(String msg){
		super(msg);
	}
}

public class ThrowingExceptionRunner {
	public static void main(String[] args) {
		Amount a1 = new Amount("USD", 10);
//		Amount a2 = new Amount("USD", 20);
		Amount a2 = new Amount("KOR", 20);
		a1.add(a2);
		System.out.println(a1);

	}

}
