package ex01;

public class Calculator {
	public Calculator() {;}
	
	void calcNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	double calcNum(int num1, double num2) {
		return num1 + num2;
	}
	int calcNum(double num1) {
		return (int)num1;
	}
	String calcNum(String str1, String str2) {
		return str1 + str2;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.print("1 + 2 = ");
		calc.calcNum(1, 2);
		System.out.println("1 + 2.1 = " + calc.calcNum(1, 2.1));
		System.out.println("2.1을 int타입으로 바꾸면 " + calc.calcNum(2.1));
		System.out.println("안녕 + 하세요 = " + calc.calcNum("안녕","하세요"));
	}
	
}
