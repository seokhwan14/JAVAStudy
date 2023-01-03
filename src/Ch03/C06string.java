package Ch03;

public class C06string {
	public static void main(String[] args) {
		System.out.println("문자열1" + "문자열2");
		System.out.println("문자열1" + ',' + "문자열2");
		System.out.println("문자열1" + 2);
		System.out.println("문자열" + ',' + '!');
		
		/**
		 * 문자열 -> 숫자형으로 변환 (정수)
		 */
		
		System.out.println("10" + "20");
		
		//웹개발 시 form으로 부터 전달받은 값들은 모두 String으로 인식되기에 파싱을 해줘야 한다
		int n1 = Integer.parseInt("10");
		int n2 = Integer.parseInt("20");
		System.out.println(n1 + n2);
		
		//문자열 -> 숫자형으로 변환(실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3 + n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");
		
		System.out.println(n5 + n6);
		
		
		
		/**
		 * 숫자형을 String으로
		 */
		int val_1 = 10;
		double val_2 = 3.14;
		
		System.out.println(val_1 + val_2);
		
		String str_1 = String.valueOf(val_1);
		String str_2 = String.valueOf(val_2);
		
		System.out.println(str_1 + str_2);
		
		
		
		
		
		
		
		
		
		
	}
}
