package udmy.act9;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');
		System.out.println("특정 단어입니까? :"+myChar.isVowel());
		System.out.println("숫자입니까? :"+myChar.isDigit());
		System.out.println("알파벳입니까? :"+myChar.isAlpha());
		System.out.println(myChar.isConsonant());
		
		myChar.printLowerCaseAlphabet();
		System.out.println();
		myChar.printUpperCaseAlphabet();
	}

}
