package arrayTask;

import java.util.Scanner;

public class ArrayHomework {

	public static void main(String[] args) {
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
		
		Scanner sc = new Scanner(System.in);
		String userInput = null, massage = "문자열을 입력해주세요 \nex) 가나다ABCabc";
		char[] charArray = null;
		
		System.out.println(massage);
		userInput = sc.nextLine();
		
		charArray = new char[userInput.length()];
		
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = userInput.charAt(i);
			if (charArray[i] >= 'A' && charArray[i] < 'Z') {
				charArray[i] += 32;
			}else if (charArray[i] >= 'a' && charArray[i] < 'z') {
				charArray[i] -= 32;
			}
			System.out.print(charArray[i]);
		}
		
		
	}

}
