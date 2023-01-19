package Ch11;

public class C02MainArg {
	public static void main(String[] args) {
		
		/**
		 * Run As JavaApplication => Run Configurations => arguments
		 * Arguments로 사용할 내용들 띄워쓰기로 구분
		 */
		
		System.out.println("배열 길이 : " + args.length);
		
		for(String s : args) {
			System.out.println(s);
		}
		
		
	}
}
