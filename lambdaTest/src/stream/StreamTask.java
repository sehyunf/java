package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
//		1) 1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(number -> {
			data1.add(number);
//			System.out.println(number);
		});
		System.out.println(data1);
		
		System.out.println("========================================");
		
//		2) ABCDEF를 각 문자별로 출력하기
		ArrayList<Character> data2 = new ArrayList<Character>();
		IntStream.rangeClosed(0, 5).forEach(num -> {
			data2.add((char)(num+'A'));
		});
//		data2.forEach(System.out::println);
		System.out.println(data2);

		System.out.println("========================================");
		
//		3) 1~100까지 홀수만 ArrayList에 담고 출력하기
		ArrayList<Integer> data3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).forEach(num -> {
			if(num % 2 != 0) {
				data3.add(num);
			}
		});
//		data3.forEach(System.out::println);
		System.out.println(data3);
		
		System.out.println("========================================");

//		4) A~F 중 D를 제외하고 arrayList에 담고 출력하기
		
		ArrayList<Character> data4 = new ArrayList<Character>();
		IntStream.rangeClosed(0, 5).forEach(num -> {
			if(num != 3) {
				data4.add((char)(num+'A'));
			}
		});
		data4.forEach(System.out::println);

		
	}
}
