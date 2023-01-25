package Ch19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		
		
		/**
		 * hashcode(), equals()를 이용하여 동일객체 여부를 판단
		 */
		Set<String> set = new HashSet();
		
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("OracleDB");
		set.add("JSP");
		set.add("Servlet");
		set.add("JSP");
		
		//마지막에 추가한 JSP는 중복값이 존재하기에 마지막에 추가한 값으로 적용(Default)
		System.out.println("총 개체수 : " + set.size());
		
		//조회하는 방법 1
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		System.out.println("--------------------");
		
		//조회하는 방법 2
		for(String str : set ) {
			System.out.println(str);
		}
		
		System.out.println("------하나 삭제해버리기-------");
		//삭제하는 방법
		set.remove("JAVA");
		System.out.println("총 개체수 : " + set.size());
	}
}
