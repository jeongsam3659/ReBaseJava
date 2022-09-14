package Step1;

import java.util.Calendar;

public class ControlCase {
	
	// 클래스
	public void run() {
		System.out.println(" 가동합니다. ");
	}
	
	public int runOne() {
		return 2;
	}
	
	public int runTwo(int a1) {
		a1 +=2;
		return a1;
	}
	
	public void CalendarTime() {
		// hour에는 현재 시간이 24시간 단위로 들어 있습니다. 
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String ampm;
		// 삼항연산자를 이용해서 값 설정
		ampm = (hour< 12) ? "오전":"오후";
		
		System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");
	}
	
	public void WhileEx() {
		int i = 1;
		while(i < 11){
            // if 문을 추가해, i가 짝수일때만 i를 출력하는 코드를 짜보세요.
            if(i % 2 == 0 ){
               System.out.println(i);
            }
            i++; 
        }
	}
	
	
	
	
	public static void main(String [] args) {
		//생성자
		ControlCase cc = new ControlCase();
		int returnA; 
		
		//메소드
		cc.run();
		cc.runTwo(3);
		cc.CalendarTime();

		System.out.println(cc.runOne());
		System.out.println(cc.runTwo(3));
		
		System.out.println("==== =====");
		cc.WhileEx();
		
		
		
	}
}
