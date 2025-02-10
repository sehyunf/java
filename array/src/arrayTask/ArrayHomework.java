package arrayTask;

import java.util.Scanner;

public class ArrayHomework {

	public static void main(String[] args) {
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      
//      매서드를 사용해 코드를 간결하게 만들자
//      
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
//
//		문자열 입력받기
//		charAt()으로 문자 받기
//		소문자범위와 대문자 범위로 if문 짜기
//		소문자 범위 해당 문자는 -32
//		대문자 범위 해당 문자는 +32
//		
//		Scanner sc = new Scanner(System.in);
//		String massage = "문자열을 입력해주세요 \nex) 가나다ABCabc";
//		char[] charArray = null;
//		
//		System.out.println(massage);
//		charArray = sc.nextLine().toCharArray();
//		
//		for(char i : charArray) {
//			if(i >= 'A' && i <= 'Z') {
//				System.out.print((char)(i+32));				
//			}else if(i >= 'a' && i <= 'z') {
//				System.out.print((char)(i-32));
//			}else {
//				System.out.print(i);
//			}
//		}
//		

//		2) 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
		
//		Scanner sc = new Scanner(System.in);
//		String massage = "한글로 바꿀 정수를 입력해주세요 \nex) 입력 : 1024 \n출력: 일공이사",
//				hangle = "공일이삼사오육칠팔구",
//				userInput = null;
//		
//		System.out.println(massage);
//		userInput = sc.nextLine();
//		for(int i = 0; i < userInput.length();i++) {
//			System.out.print(hangle.charAt(userInput.charAt(i)-48));
//		}
		
//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을문자 : c
//          c의 개수 3개
		
		Scanner sc = new Scanner(System.in);
		String massage1 = "문자열을 입력하세요 \nex)가가나가나다가나다라",
				massage2 = "찾고싶은 문자를 입력하세요 \nex)가나",
				userInput = null,
				find = null;
		int findResult = 0;
		
		System.out.println(massage1);
		userInput = sc.nextLine();
		System.out.println(massage2);
		find = sc.nextLine();
		for(int i = 0; i < userInput.length(); i++) {
			if(userInput.charAt(i)== find.charAt(0) && userInput.length()-i >= find.length()) {
				for(int j = 0; j < find.length(); j++) {
					if(userInput.charAt(i+j) != find.charAt(j)) {
						continue;
					}
					if(j == find.length() - 1) {
						findResult++;
					}				
				}
			}
		}
		System.out.println("\""+userInput+"\"중 \""+find+"\"의 갯수 : "+ findResult +"개");
		
		
	}
}
