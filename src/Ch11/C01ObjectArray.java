package Ch11;

class Person {
	String name;		//이름
	String age;			//나이
	String addr;		//주소
	
	@Override
	public String toString() {
		return "ps의 정보 - 이름 : " + name + ", 나이 : " + age + ", 주소 : " + addr;
		
	}
}



public class C01ObjectArray {
	public static void main(String[] args) {
		
		Person[] ps = new Person[3];
		
		ps[0] = new Person();
		
		/**
		 * 그냥 삽입하려 하는 경우 NullPointException이 뜬다
		 * 해결방법 : 객체를 생성해야 한다.
		 * 			객체를 생성하지 않아 저장할 공간이 없어 저장을 못했던것
		 * 			객체를 생성하지 않으면 Heap영역에는 Person배열의 공간만 만들어 진 상태,
		 * 			내부의 속성들을 담을 공간은 만들어지지 않은 상태이다
		 */
		ps[0].name = "길길동";
		ps[0].addr = "대구";
		ps[0].age = "44";
		
		ps[1] = new Person();
		
		ps[1].name = "길길동";
		ps[1].addr = "대구";
		ps[1].age = "44";
		
		System.out.println(ps[0].toString());
		System.out.println(ps[1].toString());
		
		
	}
}
