package udmy.act14;

public class StringArrRunner {
	public static void main(String[] args) {
		// 1. 요일String배열 생성.
		String [] dayOfWeek = {
				"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"
		};
		
		// 2. 글자 수가 제일 많은 String 생성.
		String dayWithMostChar = "";
		
		for(String day:dayOfWeek) {
			if(day.length() > dayWithMostChar.length()) {
				dayWithMostChar = day;
			}
		}
		
		// 3. 출력.
		System.out.println("글자 수가 많은 요일 : "+dayWithMostChar);
		
		// 4. 배열 역정렬.
		for(int i=dayOfWeek.length-1; i >= 0; i--) {
		System.out.println(dayOfWeek[i]);
	}
		
		// 정렬.
//		for(int i=0; i < dayOfWeek.length; i++) {
//			System.out.println(dayOfWeek[i]);
//		}
	}
}
