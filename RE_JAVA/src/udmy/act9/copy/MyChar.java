package udmy.act9.copy;

public class MyChar {
	private char ch;
	private int count;
	
	public MyChar(char ch) {
		this.ch = ch;
	}
	
	// Ư�� �ܾ����� Ȯ��.
	public boolean isVowel() {
		// 'a' e i o u or A E I O U
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			this.count = 1;
			return true;
		} else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			this.count = 2;
			return true;
		}
		this.count = 0;
		return false;
	}

	// ���� Ȯ��. (0~9)
	public boolean isDigit() {
		// �ƽ�Ű�ڵ� '0'�� 48. '9' 57
		if (ch >= 48 && ch <=57) {
			return true;
		}
		return false;
	}
	
	// ���ĺ� Ȯ��. (a~z , A~Z)
	public boolean isAlpha() {
		if( ch >=97 && ch <= 122) {
			// a97 ~ z122
			return true;
		}else if(ch >= 65 && ch <= 90) {
			// A65 ~ Z90
			return true;
		}
		return false;
	}
	
	// �ҹ��� / �빮�� �Ǻ�.
	public boolean isConsonant() {
		if(isAlpha() && count ==1) {
			System.out.println("���ĺ� && �ҹ���");
			return true;
		}else if(isAlpha() && count ==2) {
			System.out.println("���ĺ� && �빮��");
			return true;
		}
		return false;
	}
	
	public static void printLowerCaseAlphabet() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}
	
	public static void printUpperCaseAlphabet() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
	
}
