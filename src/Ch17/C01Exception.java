package Ch17;




public class C01Exception {
	public static void main(String[] args) {
	
		try {			
			//NullPointerException
			String str = null;
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException 예외처리");
			
			//예외의 원인 출력
			System.out.println(e.getCause());
			
			//예외 객체 설명
			System.out.println(e.toString());
			
			//예외 정보
			System.out.println(e.getStackTrace());
			
			e.printStackTrace();
		}
		
		System.out.println(" 아무말 ");
		System.out.println(" 아무말2");
		
	}
}
