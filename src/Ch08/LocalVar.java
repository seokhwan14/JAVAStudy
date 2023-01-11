package Ch08;

/**
 * 지역 변수 : {} 내에서 선언된 변수, {} 벗어나면 소멸, 절차지향문법
 */
public class LocalVar {
	// 속성
	int num = 10;

	void func1() {
		System.out.println("Num : " + num); //멤버변수 num
//		int num = 100;
//		System.out.println("Num : " + num); //func1 내에서만 사용되는 지역변수 num
		
		if(true) {
			int num = 100;
			System.out.println("Num : " + num); //if문 내에서만 사용되는 지역변수 num
		}
		System.out.println("Num : " + num); //if문 내에서만 사용되는 지역변수 num
		
	}

	void func2() {
		
	}
}
