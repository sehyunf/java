package arrayTask;

import java.util.Scanner;

public class ArrayTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      
//      .charAt()
//      단 문자열의 메서드는 사용하지 않는다.
//      
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
//
//		문자열 입력받기
//		charAt()으로 문자 받기
//		소문자범위와 대문자 범위로 if문 짜기
//		소문자 범위 해당 문자는 -32
//		대문자 범위 해당 문자는 +32
		
//		String userInput = null, stringData = null, space = "\n";
//		char[] charArray = null;
//		int arrayLength = -1;
//		
//		System.out.println("문자열을 입력해주세요 : ");
//		userInput = sc.nextLine();
//		stringData = userInput + space;
//		
//		do {
//			arrayLength++;
//		} while (stringData.charAt(arrayLength) != '\n');
//		
//		charArray = new char[arrayLength];
//		
//		for(int i = 0; i < arrayLength; i++) {
//			charArray[i] = stringData.charAt(i);
//			if (charArray[i] >= 'A' && charArray[i] < 'Z') {
//				charArray[i] += 32;
//			}else if (charArray[i] >= 'a' && charArray[i] < 'z') {
//				charArray[i] -= 32;
//			}
//			System.out.print(charArray[i]);
//		}
		
		
		
//      2) 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
//		인덱스 번호로 배열 만들기 arr1 = {'공','일','이','삼','사','오','육','칠','팔','구'}
		
//		Scanner sc = new Scanner(System.in);
////		      Scanner sc = new Scanner(System.in);
//		String userInput = null, stringData = null, space = "\n", message = "정수를 입력하세요.";
//		int[] charArray = null;
//		int arrayLength = -1;
//		String[] hangleArray = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//	     
//		System.out.println(message);
//		userInput = sc.nextLine();
//		stringData = userInput + space;
//		do {
//			arrayLength++;
//		} while (stringData.charAt(arrayLength) != '\n');
//	      
//		charArray = new int[arrayLength];
//	       
//		for(int i = 0; i < arrayLength; i++) { 
//		charArray[i] = (int)stringData.charAt(i);
//			System.out.print(hangleArray[charArray[i] - 48]);
//		}

//		2) 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
		
//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을문자 : c
//          c의 개수 3개
	      
//	    String userInput = null, stringData = null, space = "\n", message2 = "찾을문자 : ", message1 = "입력 : ", find = null;
//	 	char[] charArray = null;
//	    int arrayLength = -1, count = 0;
//	       
//	    System.out.print(message1);
//	    userInput = sc.nextLine();
//	       
//	    stringData = userInput + space;
//	    do {
//	    arrayLength++;
//	    } while (stringData.charAt(arrayLength) != '\n');
////	       배열 생성
//	    charArray = new char[arrayLength];
//	       
//	      
////	       찾을문자
//	    System.out.print(message2);
//	    find = sc.next();
//	    for(int i=0; i<arrayLength;i++) {
//	    charArray[i] = userInput.charAt(i);
//	    if(charArray[i] == find.charAt(0)) {
//	        	count++;
//	    	}
//	    }
//	    System.out.println(find + "의 갯수 : " + count);
	      

	}

}
