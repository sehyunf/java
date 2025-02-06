package operTast;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
//		대소 비교
//		두 정수를 입력받고, 더 큰 값을 출력하기
//		nextInt() 사용
		Scanner sc = new Scanner(System.in);
		String message = "두 정수를 입력하세요.\nex)10 20", result = null;
		int num1 = 0, num2 = 0;
		
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "더 큰 값 :" + num1
				: num1 == num2 ? "두 수가 같습니다" : "더 큰 값 :" + num2 ;
		
		System.out.println(result);
	}

}
