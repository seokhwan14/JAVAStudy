package Ch08;

class C14Person {

	String name;
	int age;
	float height;
	double weight;

	void talk() {
		System.out.println(name + "님이 말합니다.");
	}

	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}

	void info() {
		System.out.printf(name + "님의 정보 - 이름 : %s, 나이 : %d, 키 : %f, 몸무게 : %f\n", name, age, height, weight);
	}
	
	/**
	 * 생성자 만들어주기
	 */
	C14Person(String name, int age, float height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n키 : " + height + "\n몸무게 : " + weight;
	}

}

public class C14PersonMain {

	public static void main(String[] args) {

		C14Person hong = new C14Person("홍길동", 55, 177.5f, 80.1);
		System.out.println(hong.toString()); //모든 멤버변수가 확인될 수 있도록 toString() 오버라이딩 하기
	
	}

}
