package TestCos;


public class Lv1_Q5 {
/*
 * �ڿ��� n�� �Ű������� �־����ϴ�. 
 * n�� x�� ���� �������� 1�� �ǵ��� �ϴ� ���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
 * ���� �׻� �������� ����� �� �ֽ��ϴ�.
 * 
 * 
 * */
	
	 public int solution(int n) {
	        int answer = 0;
	        
	        for(int i=2; i<n; i++){
	            if( n % i == 1){
	                return i;
	            }
	        }       
	        return -1;
	    }
	
	public static void main(String[] args) {
		

	}

}
