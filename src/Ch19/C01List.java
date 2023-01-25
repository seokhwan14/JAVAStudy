package Ch19;

import java.util.ArrayList;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("OracleDB");
		list.add("JSP");
		list.add("Servlet");
		//중복된 값 허용
		list.add("JSP");

		
		System.out.println("list의 크기 : " + list.size());
		
		System.out.println("확인 index2 : " + list.get(2));
		
		System.out.println("---------------------------");
		
		System.out.println("list의 전체 값 확인하기");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) +"번째 : " + list.get(i));
		}
		
		list.remove(2);
		
		System.out.println("------2번째 index 삭제------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) +"번째 : " + list.get(i));			
		}
		
		System.out.println("----------전체 삭제----------");
		list.clear();
		
	}
}
