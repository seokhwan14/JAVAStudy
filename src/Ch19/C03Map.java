package Ch19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03Map {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap();
		
		
		map.put("aaa", 1234);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);

		//중복되는 값 넣어보기 - value값만 다르게
		//해당 key값에 있던 자료가 새로운 자료로 덮어씌워진다
		map.put("ddd", 7777);
		
		System.out.println("저장 수 : " + map.size());
		System.out.println("---------------------------");
		
		//전체 조회 방법
		
		//1. set에 key값을 할당하여 서칭한다
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key + "키의 값 : " + map.get(key));
		}
		System.out.println("---------------------------");
		
		//2. values() 메소드를 이용해 전체 배열값을 확인한다
		System.out.println("map : " + map.values());
		
		System.out.println("---- aaa 키값 삭제 후 확인하기 ----");
		map.remove("aaa");
		System.out.println("map : " + map.values());
	}
}
