package udmy.act14.inheritance;

public class Runner {
	public static void main(String [] args) {
		Employment emply = new Employment();
		
		emply.setName("Ranga");
		emply.setEmail("ranga@udmy.com");
		emply.setPhoneNumber("123-456-78900");
		emply.setEmployeeGrade('B');
		emply.setTitle("Programmer child");
		
		System.out.println(emply);
		
	}
}
