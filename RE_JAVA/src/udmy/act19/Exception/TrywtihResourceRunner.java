package udmy.act19.Exception;

import java.util.Scanner;

public class TrywtihResourceRunner {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int[] numbers = {12,3,4,5};
			int number = numbers[5]; 	
		}

	}
}