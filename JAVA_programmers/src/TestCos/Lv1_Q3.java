package TestCos;

public class Lv1_Q3 {

/*
   ���� ����
	�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
 * 
 */	
	
	  public long solution(int a, int b) {
	        long answer = 0;
	        int frist, second;
	        
	        if(a < b){
	            frist = a;
	            second = b;
	            
	            System.out.println("1:"+frist);
	            System.out.println("1:"+second);
	        }else{
	            frist = b;
	            second = a;
	            
	            System.out.println("2:"+frist);
	            System.out.println("2:"+second);
	        }
	        
	        if(frist != second) {
		        for(int i=frist; i<=second; i++) {
		        	answer += i;	
		        }
	        }else {
	        	answer = frist;
	        }
	        System.out.println(answer);
	        return answer;
	    }
	
	public static void main(String[] args) {
		Lv1_Q3 quest = new Lv1_Q3();
		
		quest.solution(3, 5);

	}

}
