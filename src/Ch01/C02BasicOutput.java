package Ch01;

public class C02BasicOutput {
	public static void main(String[] args) {
		
		https://github.com/jungwoogyun/JAVA20221228.git
		
		//System : OS(운영체제)관련 자원들을 저장하는 단위
		//.		 : -- 내부 ( ASDF. : ASDF라는 클래스 내부의 메소드를 차용시 )
		//out	 : 표준출력장치 ( 모니터로 )
		
		//기본 출력함수 예시, 여러 escape문자 중 엔터인 \n만 사용해보기
		System.out.print("A To Z\n");
		System.out.print("A To Z\n");
		
		//별찍기....
		System.out.print("    *\n");
		System.out.print("   ***\n");
		System.out.print("  *****\n");
		System.out.print(" *******\n");
		
		/**
		 * printf 사용하면서 자료형에 대한 공부
		 * 각 서식에 맞는 내용들을 출력
		 * %d : Int
		 * %f : Double
		 * %c : Char
		 * %s : String
		 */
		
		System.out.printf("%d %d %d\n", 10,20,30);
		System.out.printf("%f %f %f\n", 10.1234,20.1234,30.1234);
		System.out.printf("%.1f %.2f %.3f\n", 10.1234,20.1234,30.1234);
		System.out.printf("%c %c %c\n", 'a', 'b', 'c');
		System.out.printf("%s %s %s\n", "Hello", "My name is", "Hong");
		System.out.println();
		
		/**
		 * 출력 예시 서식문자 + 이스케이프 문자
		 * No.	이름		나이		주소
		 * 1	홍길동	50		대구
		 * 2	서길동	40		서울
		 * 3	동길동	30		울산 
		 */
		System.out.printf("%s %s  %s  %s\n", "No.", "이름", "나이", "주소");
		System.out.printf("%d   %s %d  %s\n", 1, "홍길동", 50, "대구");
		System.out.printf("%d   %s %d  %s\n", 2, "서길동", 40, "서울");
		System.out.printf("%d   %s %d  %s\n", 3, "동길동", 30, "울산");
		System.out.println();
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
}
