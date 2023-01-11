package Ch08;

public class C01Main {

	public static void main(String[] args) {
		/**
		 * 생성자는 객체의 기본 사이즈와 공간을 제공한다
		 */
		C01Person hong = new C01Person();
		
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
		
		
		
		
	}
}
