package collectionTest.hachMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "park1234");
		userMap.put("password", "1234");
		userMap.put("name", "박세현");
		userMap.put("age", "25");
		
		System.out.println(userMap.size());
		System.out.println(userMap);
		System.out.println(userMap.get("id"));
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		entry : key, value를 한 쌍식 가지고 있는 자료구조
//		entrySet() : Set자료구조로 바꾼다.
//		순서가 없기 때문에 iterator()사용함.
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			if(entry.getKey().equals("name")) {
				System.out.println(entry.getValue());
			}
		}
		
		
	}
}
