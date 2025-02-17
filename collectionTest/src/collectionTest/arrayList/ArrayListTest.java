package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.UnaryOperator;

public class ArrayListTest<T extends Number> {
//		<?> : 제네릭 - 포괄적인, 이름이 없는
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.
	
		

	public static void main(String[] args) {
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayList<Integer> datas = new ArrayList<>();
		ArrayListTest<Double> data1 = new ArrayListTest<Double>();
		System.out.println(data1);
		
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		datas.add(60);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		datas.get(0);
		
		try {			
			datas.get(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력");
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		
//		모든 데이터 확인
//		반복문을 쓸 필요가 없다!
		System.out.println(datas);
//		System.out.println(datas.toString());
		
//		실습
//		추가(삽입)
//		50 뒤에 500을 삽입
		Collections.shuffle(datas);
		
//		System.out.println(datas.indexOf(50));
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);			
		}
		System.out.println(datas.toString());
		System.out.println(datas);
		
//		수정 (90 -> 9) 수정
		if(datas.contains(90)) {
			datas.set(datas.indexOf(90), 9);
			System.out.println(datas);			
		}
//		datas.replaceAll(data ->  data * 10);
		
//		80을 인덱스로 삭제
//		if(datas.contains(80)) {
//			datas.remove(datas.indexOf(80));
//			System.out.println(datas);			
//		}
		
//		80을 값으로 삭제
		if(datas.contains(80)) {
			datas.remove((Integer)80);
			System.out.println(datas);			
		}
		System.out.println(datas.remove((Integer)80));	
		System.out.println(data1);
		
	}

	@Override
	public String toString() {
		return "ArrayListTest []";
	}

}
