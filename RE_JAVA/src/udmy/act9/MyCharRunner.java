package udmy.act9;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');
		System.out.println("Ư�� �ܾ��Դϱ�? :"+myChar.isVowel());
		System.out.println("�����Դϱ�? :"+myChar.isDigit());
		System.out.println("���ĺ��Դϱ�? :"+myChar.isAlpha());
		System.out.println(myChar.isConsonant());
		
		myChar.printLowerCaseAlphabet();
		System.out.println();
		myChar.printUpperCaseAlphabet();
	}

}
