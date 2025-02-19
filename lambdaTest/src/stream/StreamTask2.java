package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamTask2 {
	public static void main(String[] args) {
//		1) 5개의 문자열을 모두 소문자로 변경하기 
//		"Black", "WHITE", "reD", "yeLLow", "PiNK"
		
		ArrayList<String> result1 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PiNK"));
		
		result1.stream().map(String::toLowerCase).forEach(System.out::println);;
		
		System.out.println("========================================");
		
//		2) "Apple", "banana", "Melon", "cherry", "딸기"
//		단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
		
		ArrayList<String> result2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
		result2.stream().forEach(data -> {
			if(data.charAt(0) <= 'Z' && data.charAt(0) >= 'A') {
				System.out.println(data);
			}
		});;
		
		result2.stream()
			.filter(data -> data.charAt(0) <= 'Z' && data.charAt(0) >= 'A')
			.forEach(System.out::println);;
		
		System.out.println("========================================");
		
//		3) 한글을 정수로 변경
//		"일공이사" -> 1024
		Scanner sc = new Scanner(System.in);
//		char[] hangles = new char[]{'공','일','이','삼','사','오','육','칠','팔','구'};
		String[] hangles = new String[]{"공","일","이","삼","사","오","육","칠","팔","구"};
		ArrayList<String> data3 = new ArrayList<String>();
		ArrayList<Integer> data4 = new ArrayList<Integer>();
		String input = null;

		char[] inputArray = null;
		
		System.out.println("정수를 한글로 입력하세요 ex)일공이사");
		inputArray = sc.next().toCharArray();
		for(char c: inputArray) {
			data3.add(String.valueOf(c));
		}
		
//		System.out.println(data3);
		
		data3.stream().forEach(data-> {
			int count = 0;
			for(String s : hangles) {
				if(data.equals(s)) {
					System.out.print(count);
				}
				count++;
			}
		});
		System.out.println("========================================");
		
		String hang = "공일이삼사오육칠팔구";
		String userin = "일공이사";
		userin.chars().map(c -> hang.indexOf(c)).forEach(System.out::print);
		
		System.out.println();
		System.out.println("========================================");
		
//		4) 정수를 한글로 변경
//		"1024" -> "일공이사"
		
		System.out.println("정수를 입력하세요 ex)1234");
		
		input = sc.next().toString();
		for(int i = 0; i < input.length(); i++) {
			data4.add(Integer.parseInt(String.valueOf(input.charAt(i))));			
		}
		
		data4.stream().forEach(data -> {
			System.out.print(hangles[data]);
		});

		System.out.println("========================================");
		
		HashMap<Integer, String> hangleMap = new HashMap<Integer, String>();
		
		for(int i = 0; i < 10; i++) {
			hangleMap.put(i,String.valueOf(hang.charAt(i)));
		}
		data4.stream().map(hangleMap::get).forEach(System.out::print);
		
		
	}
	static int inin = 0;
}
