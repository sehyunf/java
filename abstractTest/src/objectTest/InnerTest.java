package objectTest;

public class InnerTest {
	
	public class InnerTest2 {
		private int value;
		
		{
			this.value = 20;
		}
		
		public InnerTest2() {;}
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
	}
	
	public static void main(String[] args) {
		InnerTest2 it2 = new InnerTest().new InnerTest2();
		System.out.println(it2.getValue());
//		값을 직접 접근할 수 없다. 은닉화
//		InnerTest2 it = new InnerTest2();
		
	}
}
