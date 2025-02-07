package methodTest;

public class MethodTest01 {
	
//	두 개의 정수를 뺀 결과를 알려주는 메서드
	int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void main(String[] args) {
//		클래스명 변수명 = new 클래스명();
		MethodTest01 mt = new MethodTest01();
		mt.subtract(5, 3);
	}
}
