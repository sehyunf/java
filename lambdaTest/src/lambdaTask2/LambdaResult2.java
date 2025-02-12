package lambdaTask2;

//	1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//	2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
//	3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//	4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//	5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//	ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
	public static void main(String[] args) {
		
		PrintNum result1 = () -> { 
			for(int i = 0; i < 10; i++) {
				System.out.print(i+1 + " ");
			}
		};
		
		result1.printUpTo10();
		
		PrintString result2 = (input, find) -> {
			int count = 0;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == find) count++;
			}
			return count;
		};
		
		System.out.println();
		System.out.println(result2.strString("가나다가나다가나나라라가가helloworld~😎", '가'));;
		
		Reverse result3 = (input) -> {
			String result = "";
			for (int i = 0; i < input.length(); i++) {
				result += input.charAt(input.length() - 1 - i);
			}
			return result;
		};
		
		System.out.println(result3.reverseString("가나다라마바사"));
		
		Remove result4 = (input, find) -> {
			String result = "";
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == find) continue;
				result += input.charAt(i);
			}
			return result;
		};
		

		System.out.println(result4.removeStr("가나다라", '다'));
		
//		Dedupe result5 = input -> {
////			중복되는걸 찾자
////			전체스캔?
////			값을 누적합 시키고 누적합시킨 문자열에서 같은값이 발견되면 다음 문자열로 넘어가자
////			누적합 시키는 for문과 검사하는 for문을 동시에 돌리자.
//			String result = "";
//			int count = 0;
//			
//			for(int i = 0; i < input.length(); i++) {
//				
//				count = 0;
//				for(int j = 0; j < result.length(); j++) {
//					if(result.charAt(j) == input.charAt(i)) count++;
//				}
//				if (count == 0) result += input.charAt(i);
//			}
//			return result;
//		};
		
		Dedupe result5 = input -> {
//			count 타입을 boolean으로 선언해서 코드를 간결하게 하고 쓸모없는 코드를 실행하지 않게한다
			String result = "";
			boolean isDupe = true;
			
			for(int i = 0; i < input.length(); i++) {
				isDupe = true;
				for(int j = 0; j < result.length() && isDupe; j++) {
					if(result.charAt(j) == input.charAt(i)) {
						isDupe = false;
					}
				}
				if (isDupe) {
					result += input.charAt(i);
				}
			}
			return result;
		};
		
		System.out.println(result5.getDedupe("가가가나다나다가가가나라마마마마마바마가가"));
		
		System.out.println("가나다라마바사".replaceAll("가","k"));
		
		
	}
}
