package udmy.act13;

public class StringJavaFunction {
	public static void main(String[] args) {
		// 137
		String tmp = "I'am a student";
		
		System.out.println(tmp.charAt(2)); 
		
		// ���ڷ� ��ȯ
		System.out.println(tmp.indexOf("st")); // 
		System.out.println(tmp.lastIndexOf("am"));
		
		// boolean������ ��ȯ.
		System.out.println(tmp.contains("S")); // ��.�ҹ��� ������.
		System.out.println(tmp.startsWith("I"));
		System.out.println(tmp.endsWith("ent"));
		System.out.println(tmp.isEmpty());
	}
}
