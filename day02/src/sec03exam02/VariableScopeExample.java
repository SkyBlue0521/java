package sec03exam02;

public class VariableScopeExample {
	
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		int v3 = 0;
		if(v1>10) {
			v2 = v1-10;
			v3= v1+v2+5;
		}
		System.out.println(v3);
		
	}

}
