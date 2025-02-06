package controlStatement;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		String message = "1.분실신고\n2.통신사 이동\n3.결제수단 변경\n0.상담사 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("실행 여부");
		} while(choice != 0);
	}

}
