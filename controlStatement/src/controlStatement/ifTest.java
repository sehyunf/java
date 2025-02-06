package controlStatement;

import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
//		두 수 비교
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		String result = null;
		String message = "두 정수를 입력하세요", exampleMessage = "예)3 6";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if(number1 > number2) {
			result = "더 큰 값 : " + number1;
		}else if(number1 < number2) {
			result = "더 큰 값 : " + number2;
		}else {
			result = "두 수가 같습니다.";
		}
		
		System.out.println(result);
	}
}
