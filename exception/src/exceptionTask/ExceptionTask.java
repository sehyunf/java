package exceptionTask;

import java.util.Scanner;

//5개의 정수를 입력 받기
//무한 입력 상태로 구현한다
//q를 입력시 나간다
//입력한 각 정수는 배열에 담는다
//if문은 딱 한 번만 사용한다.
public class ExceptionTask {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String expression = null, 
				message = "정수 5개를 순서대로 입력하세요\n프로그램 종료 -> q", 
				exampleMessage = "번 째 정수", 
				endProgram = "프로그램을 종료합니다";
		
		System.out.println(message);
		try {
			while(true) {
				count++;
				System.out.println(count > 5? "q를 눌러 프로그램을 종료해주세요" :count + exampleMessage);
				expression = sc.next();
				if(expression.equals("q")) {
					System.out.println(endProgram);
					break;
				}
				arData[count - 1] = Integer.parseInt(expression);
			}
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해 주세요\n" + endProgram);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 정상 종료 실패\n" + endProgram);
		} finally {
			for(int num : arData) {
				System.out.println(num);
			}
		}
	}
}
