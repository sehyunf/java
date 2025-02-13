package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
		
//		Alt + Shift + Z
		try {
//			System.out.println(arData[10]);
			arData[0] = 20;
			System.out.println(arData[0] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 넘어감");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
			e.printStackTrace();
		} catch (Exception e) {
		e.printStackTrace();
//		} catch (ArithmeticException e) { // 데드코드
//			System.out.println("0으로 나눌 수 없다");
		} 
	}
}
