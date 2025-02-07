package methodTask;

import java.util.Scanner;

public class MethodTask3 {
//  1) 세 정수를 뺄셈해서 결과값을 알려주는 메소드
	
	void subThreeNum(int num1, int num2, int num3) {
		int result1 = num1 - num2 - num3;
		System.out.println("세 수의 차 = " + result1);
	}
//  2) 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드(배열사용)

	void divideTwoNum(int num1, int num2) {
		int[] result2 = new int[2]; 
		String value = null;
		result2[0]= num1 / num2;
		result2[1]= num1 % num2;
		value = "몫 : " + result2[0] + "\n나머지 : " + result2[1];
		System.out.println(value);
	}
	
//  3) 1~n까지의 합을 구해주는 메소드
	
	void sumToN(int count) {
		int sum = 0;
		String result = null;
		for(int i = 0; i < count; i++) {
			sum += i+1;
		}
		result = "1~"+count+"까지의 합 : " + sum;
		System.out.println(result);
	}
	
//  4) 어떤 값이 홀수인지 짝수인지 알려주는 메소드
	
	void isOddOrEven(int num) {
		String result = null, OddOrEven = null;
		OddOrEven = num % 2 == 0 ? "짝수" : "홀수";
		result = "입력하신 수는 " + OddOrEven + "입니다";
		System.out.println(result);
		
	}
//  5) 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	
	void stringUpperAndLower(String input) {
		char[] arr1 = new char[input.length()];
		String result = "입력받은 문자에서 대소문자를 변환한 문장";
		System.out.println(result);
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= 'A' && input.charAt(i) < 'Z') {
				arr1[i] = (char)(input.charAt(i) + 32);
			}else if(input.charAt(i) >= 'a' && input.charAt(i) < 'z') {
				arr1[i] = (char)(input.charAt(i) - 32);
			}else {
				arr1[i] = input.charAt(i);
			}
			System.out.print(arr1[i]);
		}
		
	}
	
//  모든 결과 값은 콘솔에 출력하여 확인하기
	

	public static void main(String[] args) {
		MethodTask3 mt3 = new MethodTask3();
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0;
		Scanner sc = new Scanner(System.in);
		String massage1 = "세 수를 입력하세요\nex) 10 2 4", 
				massage2 = "나눌 두 수를 입력하세요\nex) 10 2",
				massage3 = "1부터 더하고싶은 수를 입력하세요\nex) 10",
				massage4 = "수를 하나만 입력해 주세요\nex) 10",
				massage5 = "문장을 입력하세요\nex) JAVAabc가나다",
				input = null;
		
//		System.out.println(massage1);
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		mt3.subThreeNum(num1, num2, num3);
		
//		System.out.println(massage2);
//		num4 = sc.nextInt();
//		num5 = sc.nextInt();
//		mt3.divideTwoNum(num4, num5);
		
//		System.out.println(massage3);
//		num6 = sc.nextInt();
//		mt3.sumToN(num6);
		
//		System.out.println(massage4);
//		num7 = sc.nextInt();
//		mt3.isOddOrEven(num7);
		
		System.out.println(massage5);
		input = sc.nextLine();
		mt3.stringUpperAndLower(input);
		
	}

}
