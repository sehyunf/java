package ex02;

public class TwoArray {
	public static void main(String[] args) {
		int[][] twoArray = new int[3][4];
		int number = 0;
		for(int[] i : twoArray) {
			for(int j : i) {
				j = ++number;
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
