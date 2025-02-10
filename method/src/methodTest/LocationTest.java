package methodTest;

public class LocationTest {
	int[] test(int[] data) {
		data[0] = 20;
		return data;
	}
	
	public static void main(String[] args) {
		LocationTest ts = new LocationTest();
		int[] data = {50};
//		int data = 50;
		ts.test(data);
		System.out.println(data[0]);
		
//		매개변수를 배열로 선언했을 경우 주소값을 저장해 사용하는것 이기
//		때문에 매서드에서 값에 접근이 이루어질 수 있다.
	}
 }
