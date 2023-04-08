package sec03exam02;

public class VariableUseExample {
	
	public static void main(String[] args) {
		int hour = 8;
		int minute = 24;
		System.out.println(hour+"시간"+minute+"분");
		
		int totalMinute = (hour*60)+minute;
		System.out.println("총"+totalMinute+"분");
		
		int nhour = 9;
		int nminute = 50;
		int ntotalMinute = (nhour*60)+nminute;
		
		System.out.println("남은시간은 총"+(ntotalMinute-totalMinute)+"분 입니다");
		
	}

}
