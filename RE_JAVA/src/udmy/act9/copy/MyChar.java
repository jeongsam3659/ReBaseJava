package udmy.act9.copy;

public class MyChar {
	private char ch;
	private int count;
	
	public MyChar(char ch) {
		this.ch = ch;
	}
	
	// 특정 단어인지 확인.
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

	// 숫자 확인. (0~9)
	public boolean isDigit() {
		// 아스키코드 '0'은 48. '9' 57
		if (ch >= 48 && ch <=57) {
			return true;
		}
		return false;
	}
	
	// 알파벳 확인. (a~z , A~Z)
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
	
	// 소문자 / 대문자 판별.
	public boolean isConsonant() {
		if(isAlpha() && count ==1) {
			System.out.println("알파벳 && 소문자");
			return true;
		}else if(isAlpha() && count ==2) {
			System.out.println("알파벳 && 대문자");
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
