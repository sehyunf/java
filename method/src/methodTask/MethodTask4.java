package methodTask;

import java.util.Scanner;

public class MethodTask4 {
//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	int countChar(String input, String find) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < find.length(); j++) {
				if(input.charAt(i) != find.charAt(j)) {
					continue;
				}
				if(j == find.length() - 1) {
					count++;
				}
			}
		}
		return count;
	}
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	String findIndex(int num1, int num2, int num3, int num4, int num5, int find) {
		int[] data = {num1,num2,num3,num4,num5};
		int index = -1;
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] == find) {
				index = i;
			}
		}
		if(index == -1) {
			return "정수가 배열에 없습니다.";	
		}
		return "정수 "+ find +"의 index : "+ index;
	}
	
	
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	
//	String korToNum(String input) {
//		String result = "", hangle = "공일이삼사오육칠팔구";
//		for(int i = 0; i < input.length(); i++) {
//			for(int j = 0; j < hangle.length(); j++) {
//				if(input.charAt(i) == hangle.charAt(j)) {
//					result += j;
//				}
//			}
//		}
//		return result;
//	}
	
	String korToNum(String input) {
		String result = "", hangle = "공일이삼사오육칠팔구";
		for(int i = 0; i < input.length(); i++) {
			result += hangle.indexOf(input.charAt(i));
		}
		return result;
	}
	
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
	
	int[] MaxAndMin(int[] num) {
		int[] returnArray = {num[0], num[0]}; 
		for(int i = 0; i < num.length; i++) {
			if(returnArray[0] < num[i]) {
				returnArray[0] = num[i];
			}
			if(returnArray[1] > num[i]) {
				returnArray[1] = num[i];
			}
		}
		return returnArray;
	}
	
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
	
	void MaxAndMinVoid(int[] num) {
		int[] returnArray = {num[0], num[0]}; 
		for(int i = 0; i < num.length; i++) {
			if(returnArray[0] < num[i]) {
				returnArray[0] = num[i];
			}
			if(returnArray[1] > num[i]) {
				returnArray[1] = num[i];
			}
		}
		System.out.println("최댓값 : "+ returnArray[0]);
		System.out.println("최솟값 : "+ returnArray[1]);
	}
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	int indexOf(String input, char find) {
		int index = -1;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == find) {
				index = i;
				return index;
			}
		}
		return index;
		
	}

	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		String massage1 = "문자열을 입력하세요 : ", 
				massage2 = "찾을 문자를 입력하세요 : ",
				input = null,
				find = null;
		int count = 0, max = 0, min = 0;
		int[] array3 = {6,2,10,4,5}, resultArray = null;
		
		System.out.print(massage1);
		input = sc.nextLine();
		System.out.print(massage2);
		find = sc.next();
		count = mt4.countChar(input, find);
		System.out.println(find + "의 갯수 : " + count);
		
		System.out.println(mt4.findIndex(10, 20, 30, 40, 50, 30));
		
		System.out.println(mt4.korToNum("공일팔육"));
		
		resultArray = mt4.MaxAndMin(array3);
		System.out.println("최댓값 = " + resultArray[0]);
		System.out.println("최솟값 = " + resultArray[1]);
		
		mt4.MaxAndMinVoid(array3);
		
		"a".indexOf(1);
		System.out.println(mt4.indexOf("하나둘삼넷오여섯칠팔아홉공오오오", '오'));
		
		

	}

}
