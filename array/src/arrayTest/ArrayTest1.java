package arrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {
//		자료형 배열명 = {값1, 값2, ...}
		
//		int[] arr1 = {10, 20, 30};
//		System.out.println(arr1[1]);
		
		int[] arr2 = {1,2,3,4,5};
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = 5 - i;
			System.out.println(arr2[i]);;
		}
		
//		arr2 for문을 사용해서  5,4,3,2,1 순서대로 담고 출력하기
		
		
	}
}
