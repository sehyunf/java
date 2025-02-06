package castingTest;

public class CastingTask2 {

	public static void main(String[] args) {
//		1번 문제
//      1번 문제
//      num1 + str1 + str2로 115 만들기
      
//      2번 문제
//      a, j, k 를 연산하여 A, J, K를 출력하기
      
//      3번 문제
//      "12.123"
//      "345.789"
//      "6789.456"
//      3개 값을 더해서 123456789를 출력하기
		
//		1번 문제
		int num1 = 1;
		String str1 = "8.24", str2 = "7.8";
		int str1num = (int)Double.parseDouble(str1), str2num = (int)Double.parseDouble(str2);
		String res1 = "" + num1 + ( str1num + str2num );
		System.out.println(res1);
		
//		2번 문제
		char char1 = 'a', char2 = 'j', char3 = 'k';
		String res2 = (char)(char1 - 32)+ ", " +  (char)(char2 - 32) + ", " + (char)(char3 - 32);
		System.out.println(res2);
		
//		3번 문제
		int n1 = (int)Double.parseDouble("12.123");
		int n2 = (int)Double.parseDouble("345.789");
		int n3 = (int)Double.parseDouble("6789.456");
		String res3 = "" + n1 + n2 + n3;
		System.out.println(res3);
	}

}
