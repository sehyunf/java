package castingTask1;

import java.util.Scanner;

//	넷플릭스
//	애니메이션, 영화, 드라마
//	사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능 사용 (출력)
//	영화라면 "4D" 기능 사용 (출력)
//	드라마라면 "굿즈 기능 사용 (출력)
//
// 	넷플릭스 클래스 생성
//	애니메이션, 영화, 드라마 클래스 생성 후 넷플릭스 상속
//	업캐스팅 후 클래스로 묶기
class Netflix {
	
	public Netflix() {;}
	
	void checkContent(Netflix content) {
		(content).show();
	}

	void show() {}
	
}

class Animation extends Netflix{
	
	public Animation() {;}
	
	void show() {
		System.out.println("자막 지원");
	}
}
class Movie extends Netflix{
	
	public Movie() {;}
	
	void show() {
		System.out.println("4D");
	}
}
class Drama extends Netflix{
	public Drama() {;}
	void show() {
		System.out.println("굿즈 기능 사용");
	}
}



public class CastingTask {
	public static void main(String[] args) {
		Netflix netflix = new Netflix();
		netflix.checkContent(new Drama());
		netflix.checkContent(new Animation());
		netflix.checkContent(new Movie());
		
//		Scanner sc = new Scanner(System.in);
//		int i = -1;
//		
////		((Animation)netflix1).showText();
////		((Movie)netflix2).show4D();
////		((Drama)netflix3).showGoods();
//		System.out.println("1) 애니메이션 2) 영화 3) 드라마 0) 종료");
//		while(i != 0) {
//			i = sc.nextInt();
//			switch (i) {
//			case 1: {
//				((Animation)netflix1).show();
//				break;
//			}
//			case 2: {
//				((Movie)netflix2).show();
//				break;
//			}
//			case 3: {
//				((Drama)netflix3).show();
//				break;
//			}
//			case 0: {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			default:
//				System.out.println("잘못 입력하셨습니다");
//			}
//		}
		
		
	}
	
}
