package lambdaExpert;

import java.util.Scanner;

public class MyMath {
//	연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
	public static Calc caculater(String oper) {
		return null;
	}
	public static void main(String[] args) {
//		사용자가 수식을 입력
//		전체 수식에서 연산자만 분리하는 메서드를 구현
//		알맞게 연산 처리
//		결과값을 출력
//		문자열을 특수기호를 기준으로 나누는 메서드
//		if( 배열[0].equal(""))
		
//		스캐너 임포트
	    Scanner sc = new Scanner(System.in);
//	    숫자가 들어갈 배열 선언
	    String[] array = null, operArray = null;
	    String inputCalc = sc.nextLine();
//	    문자를 받아서 +와-기준으로 나눈값을 배열에 넣는다.
	    array = inputCalc.split("\\+|\\-|\\*|\\/");
	    String opers = "";
	    
	    
	    for(int i = 0; i < inputCalc.length(); i++) {
	    	if(inputCalc.charAt(i) == '+'|| inputCalc.charAt(i) == '-'|| inputCalc.charAt(i) == '*'|| inputCalc.charAt(i) == '/') {
	    		opers += inputCalc.charAt(i);
	    	}
	    }
	    
	    System.out.println(opers);
	    operArray = opers.split("");
	    for(String i: operArray) {
	    	if(i.equals("*")) {
//	    		곱하기 메서드 실행!
	    	}
	    	if(i.equals("/")) {
//	    		나누기 메서드 실행!
	    	}
	    }
		
		
	}
}
