package classTest;

public class A {
	int data;
	
//	기본 생성자
	public A() {;}
	
//	값을 초기화 시키기 위한 생성자
	public A(int data) {
		this.data = data;
	}
	
	void printData() {
		System.out.println(this);
		System.out.println(this.data);
	}
	
	public static void main(String[] args) {
		A a = new A(10);
		A b = new A(20);
//		System.out.println(a.data);
//		System.out.println(b.data);
		a.printData();
		b.printData();
		
		String ab = "가나다라";
		String abc = "가나";
		String def = "다라";
		String abcdef = abc.concat(def);
		System.out.println(ab == abcdef);
		
	}
}
