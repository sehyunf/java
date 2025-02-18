package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ENFP");
		mbtiType.add("INFJ");
		mbtiType.add("ISFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENTP");
		mbtiType.add("INFP");
		
		System.out.println(mbtiType);
		
//		Iterator
//		순서가 없을 때 순서를 부여하는 자료구조
		Iterator<String> iter = mbtiType.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(iter.hasNext());
		
//		중복값 제거
		
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,9,9,9,9));
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
		
	}
}
