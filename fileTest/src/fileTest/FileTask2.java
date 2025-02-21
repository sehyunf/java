package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask2 {
	public static void main(String[] args) throws IOException{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("jobs.txt"));
		
		ArrayList<User> users = new ArrayList<User>();

		User user1 = new User(1L, "홍길동", 20, "도둑");
		User user2 = new User(2L, "김철수", 20, "코딩");
		User user3 = new User(3L, "김영희", 20, "교사");
		User user4 = new User(4L, "신짱구", 20, "유치원생");
		User user5 = new User(5L, "흰둥이", 20, "개");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
		
//		000님의 직업은 000입니다. 를 jobs.txt에 작성하고, 콘솔에 출력하기
		
		users.stream().forEach(user -> {
				try {
					bufferedWriter.write(user.getName() + "님의 직업은 " + user.getJob() + "입니다.\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
		});
		bufferedWriter.close();
		  
//		값을 가져와서 출력
		BufferedReader buffredReader = new BufferedReader(new FileReader("jobs.txt"));
		String line = null;
		
		while((line = buffredReader.readLine()) != null) {
			System.out.println(line);
		}
		buffredReader.close();
		
	}
}
