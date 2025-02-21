package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamTask3 {
	
	static int result1sum = 0;
	
	public static void main(String[] args) {
		
		int sum = 0;
		
//    	1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		numbers.stream().forEach(num -> { result1sum += num; });
		System.out.println(result1sum);
		
		
		ArrayList<Integer> numbers1_1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		for(int i = 0; i < numbers1_1.size(); i++) {
			sum += numbers1_1.get(i);
		}
		System.out.println(sum);
		
		ArrayList<Integer> numbers1_2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		Optional<Integer> result1_2 = numbers1_2.stream().reduce((a , b) -> a + b);
//		result1_2.ifPresent(result -> );
		
//      1) 1~50까지 ArrayList에 담고 출력하기
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).forEach(num -> {
			num1.add(num);
			System.out.print(num + " ");
		});
		
		System.out.println();
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(num -> {
			if(num % 2 != 0) {
				num2.add(num);
				System.out.print(num + " ");				
			}
		});
		System.out.println();
//      3) 1~50까지 ArrayList에 짝수만 담고 출력하기
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).forEach(num -> {
			if(num % 2 == 0) {
				num3.add(num);
				System.out.print(num + " ");				
			}
		});
		System.out.println();
		
//      4) a~z까지 ArrayList에 담고 출력하기
		ArrayList<Character> chars4 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').forEach(chars -> {
				chars4.add((char)chars);
				System.out.print((char)chars + " ");
		});
		System.out.println();
		
		ArrayList<Character> chars4_1 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').forEach(chars -> {
			chars4_1.add(Character.toUpperCase((char)chars));
			System.out.print(Character.toUpperCase((char)chars) + " ");
		});
		System.out.println();

//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
		ArrayList<Character> chars5 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').forEach(chars -> {
			if(chars % 2 != 0) {
				chars5.add((char)chars);
				System.out.print((char)chars + " ");				
			}
		});
		System.out.println();
		
//      6) 1~50까지 ArrayList에 담고 10~20만 출력하기
		ArrayList<Integer> num6 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).forEach(num -> {
				num6.add(num);
				if(num >= 10 && num <= 20) {
					System.out.print(num + " ");
				}
		});
		System.out.println();
		
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
		
		ArrayList<Integer> num7 = new ArrayList<Integer>();
		int result = 0;
		IntStream.rangeClosed(1, 10).forEach(num -> {
				num7.add(num);
		});
		
		for(Integer evenNum: num7) {
			if(evenNum % 2 == 0) {
				result += evenNum;
			}
		}
		System.out.println(result);
		
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
		ArrayList<String> strings8 = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
		
		strings8.stream().filter(data -> data.contains("a")).forEach(System.out::println);;
		
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
		ArrayList<Integer> num9 = new ArrayList<Integer>();
		int result9 = 0;
		IntStream.rangeClosed(1, 10).forEach(num -> {
				num9.add(num);
		});
		
		for(Integer num: num9) {
				result9 += num;
		}
		System.out.println(result9);
		
//		reduce사용
		OptionalInt result9_1 =IntStream.rangeClosed(1, 10).reduce((a , b) -> a + b);
		System.out.println(result9_1.getAsInt());
		
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}

		
		
//    	2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//    	모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1, member2, member3, member4, member5, member6));
		
		members.stream().filter(data -> data.getHobby().contains("개발")).forEach(System.out::println);;
//		System.out.println(members);
		
		
//    	필드 : 이름, 취미, 소개
//    	홍길동, 축구_농구_야구, 나는 축구왕!
//    	이순신, 개발_당구_축구, 나는 개발자 좋아!
//    	장보고, 피아노, 피아노만 한 우물!
//    	김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//    	김영희, 골프_야구, 운동 선수는 나의 꿈
//    	흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		
	}
	
	
	
}
