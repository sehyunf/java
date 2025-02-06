package inputTask;

import java.util.Scanner;

public class InputTask1 {
//	두 정수를 입력한 뒤 덧셈 결과를 출력한다.
//	단 sc.next()만 사용한다.
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int num1 = 0, num2 = 0, result = 0;
			System.out.println("두 정수를 입력하세요");
			num1 = Integer.parseInt(sc.next());
			num2 = Integer.parseInt(sc.next());
			result = num1 + num2;
			System.out.println("합 = " + result);	
		} catch (Exception e) {
			System.out.println("정확한 숫자를 두개 입력해주세요");
		}
	}
}
