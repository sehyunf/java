package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 1씩 증가
//		IntStream.range(0, 10); // 0 ~ 9까지
//		
//		IntStream.range(0, 10).forEach(System.out::println);
//		
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		IntStream.rangeClosed(1, 10).forEach(number -> {
//			datas.add(number);
//			System.out.println(number);
//		});
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.forEach(System.out::println);
		
//		10 ~ 1까지 ArrayList에 담고 출력하기, 연산 후 add하기
		
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 9).forEach(number -> {
			data1.add(10 - number);
//			System.out.println(10 - number);
		});
		
//		IntStream inst = IntStream.rangeClosed(0, 9);
//		inst.forEach(System.out::println);
		
//		data1의 인덱스 0부터 4까지 삭제
		
//		for (int i = 0; i < 5; i++) {
//			data1.remove(0);			
//		}
		
		IntStream.range(0, 5).forEach(n -> {
			data1.remove(0);
		});
		
//		data1.forEach(System.out::println);
		
//		문자열 stream
//		chars() : 문자열을 IntStream으로 변환
		String data3 = "ABCDEFG";
//		data3.chars().forEach(System.out::println);
		
		String data4 = "ㄱㄲㄳㄴㄷㄹㅁ";
		data4.chars().forEach((c) -> {
//			System.out.print((char)c);
		});
//		System.out.println();
			
//		.map()
//		data4.chars().map((c) -> c + 710).forEach(c -> {
//			System.out.print((char)c);
//		});
//		System.out.println((char)12599);

		User user1 = new User(1, "박세현", 21, "백수");
		User user2 = new User(2, "홍길동", 22, "자택경비원");
		User user3 = new User(3, "장보고", 23, "무급프리랜서");
		User user4 = new User(4, "이순신", 24, "실업자");
		User user5 = new User(5, "이성계", 25, "전");
		
//		직업만 출력하기
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		users.forEach(System.out::println);
//		users.stream().map(User::getJob).map(job -> "직업: " + job).forEach(System.out::println);
		
//		유저의 나이만 출력하기, 참조형X
//		for(User user: users) {
//			System.out.println("나이 : " + user.getAge());
//		}
//		
//		users.stream().map(user -> user.getAge()).forEach(age -> {
//			System.out.println(age);
//		});
		
//		실습
//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고, 모든 경로앞에 "/app"을 붙여준다.
		
		ArrayList<String> url = new ArrayList<String>();
		url.add("/news");
		url.add("/game");
		url.add("/brand");
		url.add("/rank");
		
		url.replaceAll("/app"::concat);
//		url.forEach(System.out::println);
		
//		정렬 : sortes()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,5,2,4,7,9,56,3));
//		numbers.stream().sorted().forEach(System.out::println);
//		내림차순
//		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		결과값의 리턴을 다양한 타입을 리턴 : .collect(Collectors.to~());
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1,2,5,2,4,7,9,56,3));
		List<Integer> list = numbers2.stream().map(n -> n + 10).collect(Collectors.toList());
//		System.out.println(list);
		
//		문자열로 바꾸기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(1,2,5,2,4,7,9,56,3));
		String str = numbers3.stream().sorted().map(String::valueOf).collect(Collectors.joining());
//		System.out.println(str);
		
//		filter()
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(1,2,5,2,4,7,9,56,3));
		ArrayList<Integer> even = new ArrayList<Integer>();
		numbers4.stream().filter((n) -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
		
		
	}
}
