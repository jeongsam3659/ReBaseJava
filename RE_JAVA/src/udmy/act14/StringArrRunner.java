package udmy.act14;

public class StringArrRunner {
	public static void main(String[] args) {
		// 1. ����String�迭 ����.
		String [] dayOfWeek = {
				"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"
		};
		
		// 2. ���� ���� ���� ���� String ����.
		String dayWithMostChar = "";
		
		for(String day:dayOfWeek) {
			if(day.length() > dayWithMostChar.length()) {
				dayWithMostChar = day;
			}
		}
		
		// 3. ���.
		System.out.println("���� ���� ���� ���� : "+dayWithMostChar);
		
		// 4. �迭 ������.
		for(int i=dayOfWeek.length-1; i >= 0; i--) {
		System.out.println(dayOfWeek[i]);
	}
		
		// ����.
//		for(int i=0; i < dayOfWeek.length; i++) {
//			System.out.println(dayOfWeek[i]);
//		}
	}
}
