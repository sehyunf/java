package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
//      25분
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
//	    int[] arr1 = new int[5];
//	    for(int i = 0; i < 10; i++) {
//	    	if ((10-i) % 2 == 0) {
//	    		arr1[i/2] = 10-i;
//	    		System.out.println(arr1[i/2]);
//	    	}
//	    }
//      1~10까지 배열에 담고 출력
//		int[] arr2 = new int[10];
//		for(int i = 0; i < 10 ; i++) {
//			arr2[i] = i + 1;
//			System.out.println(arr2[i]);
//		}
	    
//      1~100까지 배열에 담은 후 홀수만 출력
//		int[] arr3 = new int[100];
//		for(int i = 0; i < 100 ; i++) {
//			arr3[i] = i + 1;
//			if ((i+1) % 2 != 0) {
//				System.out.println(arr3[i]);
//			}
//		}
		
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arr4 = new int[100];
//		int result = 0;
//		for(int i = 0; i < 100 ; i++) {
//			arr4[i] = i + 1;
//			if ((i+1) % 2 == 0)
//				result += i + 1;
//		}
//		System.out.println(result);
//      A~F까지 배열에 담고 출력
//		char[] arr5 = new char[6];
//		char a = 'A';
//		for(int i = 0; i < 6 ; i++) {
//			arr5[i] = (char)(a + i);
//			System.out.println(arr5[i]);
//		}
		
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
//		
//		char[] arr6 = new char[5];
//		char a = 'A';
//		for(int i = 0; i < 6 ; i++) {
//			if (i < 2) {
//				arr6[i] = (char)(a + i);
//				System.out.println(arr6[i]);				
//			}else if(i == 2) {
//				continue;
//			}else {
//				arr6[i-1] = (char)(a + i);
//				System.out.println(arr6[i-1]);
//			}
//		}
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력하기
//		Scanner sc = new Scanner(System.in);
//		String massage = "5개의 정수를 입력해주세요 ex) 1 2 3 4 5" , resMassage = "최댓값 : %d \n최솟값 : %d";
//		int[] arr7 = new int[5];
//		int max = 0, min = 0;
//		
//		System.out.println(massage);
//		for (int i=0; i < arr7.length; i ++) {
//			arr7[i] = sc.nextInt();
//			if(i == 0) {max = arr7[i]; min = arr7[i];}
//			max = arr7[i] >= max ? arr7[i] : max;  
//			min = arr7[i] <= min ? arr7[i] : min;  
//		}
//		System.out.printf(resMassage,max,min);
//		
		
//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
		Scanner sc = new Scanner(System.in);
		String firstMassage = "배열의 길이가 될 정수를 입력해주세요" , secondMassage = "배열의 길이만큼 정수를 입력해주세요 ex) 1 2 3 4 5 ...";
		int[] arr8 = null;
		int sum = 0;
		double avg = 0.0;
		
		System.out.println(firstMassage);
		arr8 = new int[sc.nextInt()];
		System.out.println(secondMassage);
		for (int i=0; i < arr8.length; i++) {
			arr8[i] = sc.nextInt();
			sum += arr8[i];
		}
		avg = (double)sum/arr8.length;
		System.out.printf("평균값 : " + avg);
		
		
		
		
		
	}
}
