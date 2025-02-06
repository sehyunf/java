package operTast;

import java.util.Scanner;

public class OperTask1 {

	public static void main(String[] args) {
//		마스터
//		사용자에게 값을 입력받고
//		정수라면 정수입니다.
//		실수라면 실수입니다.
//		예) 183 -> 입력한 값은 정수입니다.
//		183.5 -> 입력하 값은 실수입니다.
//		삼항 연산자를 사용하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 혹은 실수를 입력해주세요");
//		double inputString = sc.nextDouble();
//		String result = inputString % 1 == 0 ? "정수입니다" : "실수입니다.";
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		String message = "정수 혹은 실수를 입력해주세요 \nex) 10, 10.1", result = null;
		double inputDouble = 0;
		System.out.println(message);
		inputDouble = sc.nextDouble();
		result = "입력한 값은 " + (inputDouble % 1 == 0 ? "정수입니다" : "실수입니다.");
		
		System.out.println(result);
		
	}

}
