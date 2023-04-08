package sec02.exam03;

public class ArrayCreateByNewExample {
	
	public static void main(String[] args) {
		int[] ar1= new int[3];
		for(int i=0; i<3;i++) {
			System.out.println("ar1["+i+"] : "+ar1[i]);
		}
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		for(int i=0; i<3;i++) {
			System.out.println("ar1["+i+"] : "+ar1[i]);
		}
		
		double[] ar2= new double[3];
		for(int i=0; i<3;i++) {
			System.out.println("ar2["+i+"] : "+ar2[i]);
		}
		ar2[0] = 0.1;
		ar2[1] = 0.2;
		ar2[2] = 0.3;
		for(int i=0; i<3;i++) {
			System.out.println("ar2["+i+"] : "+ar2[i]);
		}
		
		String[] ar3= new String[3];
		for(int i=0; i<3;i++) {
			System.out.println("ar3["+i+"] : "+ar3[i]);
		}
		ar3[0] = "1¿ù";
		ar3[1] = "2¿ù";
		ar3[2] = "3¿ù";
		for(int i=0; i<3;i++) {
			System.out.println("ar3["+i+"] : "+ar3[i]);
		}
		
		
		
	}

}
