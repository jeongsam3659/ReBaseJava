package udmy.act12;

public class StringJavaFunction2 {
	public static void main(String[] args) {
		// 138
		String s1 = "apple";
		String s2 = "juice";
		String sConcat = s1.concat(s2);
		
		System.out.println(sConcat);
		System.out.println(s1);
		System.out.println(s2);
		
		// 139
		// join
		System.out.println(String.join(",a,", "BB","CC","DD"));
		System.out.println(s1.replace("a", "b"));
	}
}
