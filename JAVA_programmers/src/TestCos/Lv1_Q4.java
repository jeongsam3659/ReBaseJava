package TestCos;

public class Lv1_Q4 {
	 public double solution(int[] arr) {
	        double answer = 0;
	        
	        double arrLength = arr.length;
	        double sumArr = 0;
	        
	        System.out.println("배열 길이 :"+arrLength);
	       
	        
	        for(int i=0; i<arrLength; i++ ){
	            sumArr += arr[i];
	        }
	        
	        System.out.println("배열값 총합 :"+sumArr);
	        
	        answer = sumArr / arrLength;
	        
	        System.out.println(answer);
	        
	        return answer;
	    }
	
	public static void main(String [] args) {
		
		Lv1_Q4 q4 = new Lv1_Q4();
		
		int [] arr = {1,2,3,4};
		
		q4.solution(arr);
		
	}
}
