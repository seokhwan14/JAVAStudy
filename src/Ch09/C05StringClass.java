package Ch09;

public class C05StringClass {
	public static void main(String[] args) {
		
		/**
		 * String형의 비교, ==과 equals의 차이,
		 * ==은 주소값 자체가 같아야함 
		 * 3,4는 객체생성으로 힙 영역에 각각 다르게 할당 된 주소에 저장
		 * 1,2는 일반 문자열로 상수풀에 저장됨, 이 경우 값이 동일할 경우 다른 주소값을 할당하지 않고 같이 저장해둔다
		 */
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");

		System.out.println(" == 사용");
		System.out.println("str1 = str2 : " + (str1 == str2));
		System.out.println("str3 = str4 : " + (str3 == str4));
		System.out.println("str1 = str3 : " + (str1 == str3));
		System.out.println("str1 = str4 : " + (str1 == str4));
		System.out.println("equals 사용");
		System.out.println("str1 = str2 : " + (str1.equals(str2)));
		System.out.println("str3 = str4 : " + (str3.equals(str4)));
		System.out.println("str1 = str3 : " + (str1.equals(str3)));
		System.out.println("str1 = str4 : " + (str1.equals(str4)));

	}
}
