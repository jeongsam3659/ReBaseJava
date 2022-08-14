package udmy.act19.Exception;

//class Amout, String , int , ������, toString/return int , String, 
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
//			throw new RuntimeException("���� ��ȭ�� ���� �ʽ��ϴ�.");
//		}
//		
//		this.amount = this.amount +that.amount;
//	}

//Exception
//	public void add(Amount that)throws Exception{
//		if(!this.currency.equals(that.currency)) {
//			throw new Exception("���� ��ȭ�� ���� �ʽ��ϴ�.");
//		}
//		
//		this.amount = this.amount +that.amount;
//	}
//}
	
	public void add(Amount that){
		if(!this.currency.equals(that.currency)) {
			throw new Stay_DoNotMatchExceptions("[����] Stay_DoNotMatchExceptions �������� �з��Դϴ�.");
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
