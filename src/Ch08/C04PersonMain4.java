package Ch08;

class C04Person {

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

}

public class C04PersonMain4 {

	public static void main(String[] args) {

		C04Person hong = new C04Person();

		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;

		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);

		hong.walk();
		
		hong.talk();
		
		hong.info();

	}

}
