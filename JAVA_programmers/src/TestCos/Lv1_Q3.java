package TestCos;

public class Lv1_Q3 {

/*
   문제 설명
	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
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
