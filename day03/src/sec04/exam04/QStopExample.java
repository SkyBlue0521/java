package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("KeyCOde: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.print("����");
	}

}
