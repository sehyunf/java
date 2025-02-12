package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambdaInter = new LambdaInter() {
//			@Override
//			public boolean checkMultipleOf10(int num) {
//				return num % 10 == 0;
//			}
//		};
//		System.out.println(lambdaInter.checkMultipleOf10(20));
//		가독성이 안좋다!!
		
//		LambdaInter lambdaInter = (number) -> {return number % 2 == 0;};
//		LambdaInter lambdaInter = number -> {return number % 2 == 0;};
		LambdaInter lambdaInter = number -> number % 2 == 0;

		System.out.println(lambdaInter.checkMultipleOf10(20));
	}
}
