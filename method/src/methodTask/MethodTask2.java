package methodTask;

import java.util.Scanner;

public class MethodTask2 {
	
//	이름을 n번 출력하는 메서드 이름을 n번만큼 출력해주는 프로그램
	void printNameFromToCount(String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask2 mt2 = new MethodTask2();
		Scanner sc = new Scanner(System.in);
		String name = null, message1 = "이름을 입력하세요.", message2 = "이름을 몇 번 출력하시겠습니까? \nex)5";
		int count = 0;
		
		System.out.println(message1);
		name = sc.nextLine();
		System.out.println(message2);
		count = sc.nextInt();
		
		mt2.printNameFromToCount(name, count);
	}

}
