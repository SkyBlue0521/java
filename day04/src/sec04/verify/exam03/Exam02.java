package sec04.verify.exam03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ��:");
		String strnum1 = sc.nextLine();
		System.out.print("�ι�° ��:");
		String strnum2 = sc.nextLine();
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		int result = num1+num2;
		System.out.println("���� ���:"+result);
	}

}
