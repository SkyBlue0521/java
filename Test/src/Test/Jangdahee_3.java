package Test;

public class Jangdahee_3 {
	
	public static void main(String[]args) {
		int[]array = {83,90,87};
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum+=array[i];
		}
		Double avg = (double)sum/3;
		System.out.print("sum:"+sum);
		System.out.print("avg:"+avg);	
	}

}
