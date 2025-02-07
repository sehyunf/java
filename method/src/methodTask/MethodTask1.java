package methodTask;

public class MethodTask1 {
//  1~10까지 println으로 출력하는 메서드
//  "홍길동" 이름을 n번 println()으로 출력하는 메서드
  
//  결과를 콘솔에 출력하기
	void printOneToTen() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	void printName(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}
	public static void main(String[] args) {
		MethodTask1 mt1 = new MethodTask1();
		mt1.printOneToTen();
		mt1.printName(10);
	}

}
