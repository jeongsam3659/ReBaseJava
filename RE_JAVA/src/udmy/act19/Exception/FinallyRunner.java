package udmy.act19.Exception;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			int[] numbers = {12,3,4,5};
			int number = numbers[5];
				
		} catch(ArrayIndexOutOfBoundsException Array_e) {
			System.out.println("오류사항 - ArrayIndexOutOfBoundsException");
			Array_e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Scanner가 확실히 null값인지를 확인하기 싶은경우
			// null check
			if(sc != null) {
				sc.close();
				System.out.println(" sc.close(); ");
			}

		}

	}

}
