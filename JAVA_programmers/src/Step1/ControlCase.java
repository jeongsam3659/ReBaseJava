package Step1;

import java.util.Calendar;

public class ControlCase {
	
	// Ŭ����
	public void run() {
		System.out.println(" �����մϴ�. ");
	}
	
	public int runOne() {
		return 2;
	}
	
	public int runTwo(int a1) {
		a1 +=2;
		return a1;
	}
	
	public void CalendarTime() {
		// hour���� ���� �ð��� 24�ð� ������ ��� �ֽ��ϴ�. 
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String ampm;
		// ���׿����ڸ� �̿��ؼ� �� ����
		ampm = (hour< 12) ? "����":"����";
		
		System.out.println("���ݽð��� " + hour + "���̰�, " + ampm + "�Դϴ�.");
	}
	
	public void WhileEx() {
		int i = 1;
		while(i < 11){
            // if ���� �߰���, i�� ¦���϶��� i�� ����ϴ� �ڵ带 ¥������.
            if(i % 2 == 0 ){
               System.out.println(i);
            }
            i++; 
        }
	}
	
	
	
	
	public static void main(String [] args) {
		//������
		ControlCase cc = new ControlCase();
		int returnA; 
		
		//�޼ҵ�
		cc.run();
		cc.runTwo(3);
		cc.CalendarTime();

		System.out.println(cc.runOne());
		System.out.println(cc.runTwo(3));
		
		System.out.println("==== =====");
		cc.WhileEx();
		
		
		
	}
}
