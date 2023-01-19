package Ch15;

interface A {}

interface B {}

/**
 * extends로는 다중상속이 불가능하지만
 * implements로는 다중상속이 가능하다
 */

//class C extends A,B {}

class C implements A, B {}

class D {}

/**
 * extends를 먼저 사용 후 implements를 사용 가능, 반대는 불가능
 */
//class E extends D implements A,B {}

class E extends D implements A,B {}





public class C02다중상속확인 {
	public static void main(String[] args) {
		
	}
}
