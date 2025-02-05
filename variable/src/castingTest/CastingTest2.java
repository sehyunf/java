package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
//		강제 형변환(문자형)
		System.out.println((char)('A' * '?' + 40000));
		// Comparing identical expressions (같은 결과인데 왜 비교하는가?)
		System.out.println('A' == 65);
		System.out.println((char)66);
	}
}
