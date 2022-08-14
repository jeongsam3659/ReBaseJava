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
			System.out.println("�������� - ArrayIndexOutOfBoundsException");
			Array_e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Scanner�� Ȯ���� null�������� Ȯ���ϱ� �������
			// null check
			if(sc != null) {
				sc.close();
				System.out.println(" sc.close(); ");
			}

		}

	}

}
