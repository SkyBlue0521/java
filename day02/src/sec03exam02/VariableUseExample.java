package sec03exam02;

public class VariableUseExample {
	
	public static void main(String[] args) {
		int hour = 8;
		int minute = 24;
		System.out.println(hour+"�ð�"+minute+"��");
		
		int totalMinute = (hour*60)+minute;
		System.out.println("��"+totalMinute+"��");
		
		int nhour = 9;
		int nminute = 50;
		int ntotalMinute = (nhour*60)+nminute;
		
		System.out.println("�����ð��� ��"+(ntotalMinute-totalMinute)+"�� �Դϴ�");
		
	}

}
