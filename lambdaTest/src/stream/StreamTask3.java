package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask3 {
	
	static int result1sum = 0;
	
	public static void main(String[] args) {
		
		int sum = 0;
		
//    	1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		numbers.stream().forEach(num -> { result1sum += num; });
		System.out.println(result1sum);
		
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		for(int i = 0; i < numbers2.size(); i++) {
			sum += numbers2.get(i);
		}
		
		System.out.println(sum);
		
//      1) 1~50까지 ArrayList에 담고 출력하기
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
//      3) 1~50까지 ArrayList에 짝수만 담고 출력하기
//      4) a~z까지 ArrayList에 담고 출력하기
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
//      6) 1~50까지 ArrayList에 담고 10~20만 출력하기
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}

//    	2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//    	모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
		
		Member mem1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member mem2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member mem3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member mem4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member mem5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member mem6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(mem1,mem2,mem3,mem4,mem5,mem6));
		
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
