package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {
	public static String userId;
	boolean login;
	public ArrayList<User> users = DBConnecter.users;
	
//	아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) {
			users.add(user);			
		}
	}
	
//	로그인
	
//	로그인 로직
//	아이디로 유저 호출
//	users반복 돌림
//	아이디로 비번 조회
//	public void login(User user) {
//		if(!login) {
//			for(User users : users) {
//				if(users.getId().equals(user.getId())) {
//					if(users.getPassword().equals(user.getPassword())) {
//						login = true;			
//						System.out.println("로그인~");
//						return;
//					}else {
//						System.out.println("비밀번호가 틀립니다");
//						return;
//					}			
//				}
//			}
//			System.out.println("입력하신 아이디의 사용자가 없습니다.");
//		}else {
//			System.out.println("이미 로그인 되어있습니다. ");
//		}
//	}
	
	public boolean login(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
	
	public void logout() {
		userId = null;
	}
	
//	암호화
	
	public String encrypt(User user) {
		String result = "";
		for(char c: user.getPassword().toCharArray()) {
			result += (char)('S'+ c * 1101); 
		};
		return result;
	}
	
//	비밀번호 변경(마이페이지)
//	비밀번호 변경(30일)
//	인증번호 전송
//	인증번호 확인
	
	
	public static void main(String[] args) {
		UserField user = new UserField();
		User hong = new User("hong123", "홍길동", "hong123", "01012345678");
		user.join(hong);
		System.out.println(user.encrypt(hong));
	}
	
	
	
}
