package Ch09;


/**
 * 정보 은닉
 * 클래스 내의 멤버변수(멤버함수)의 사용을 제한하는 문법
 */

/**
 * 접근제한자
 * public		:	모든 클래스에서 접근 가능 
 * default		:	동일 패키지에 속한 클래스에서만 접근 가능
 * private		:	현재 클래스 내에서만 접근 가능
 * protected	:	동일 패키지에 속한 클래스 or 상속관계에서의 하위클래스에서만 접근가능
 */

class C01Person {
	//속성
	String name;				//이름
	private String id;			//주민번호
	private int age;			//나이
	float weight;				//무게
	double height;				//키
	private int salary;			//급여
	
	//생성자 만들어주기 - Generate Constructors
	public C01Person(String name, String id, int age, float weight, double height, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "C01Person's toString : name = " + name + ", 주민번호 = " + id + ", 나이 = " + age + ", 몸무게 = " + weight + ", 키 = " + height + ", 급여 = " + salary;
	}
	
	/**
	 * Setter, Getter
	 * Generate Setter - Getter
	 */ 
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}


public class C02InfoHide {
	public static void main(String[] args) {
		
		C01Person ps = new C01Person("길동", "000000-0000001", 22, 85.0f, 177.0, 1000);
		
		/**
		 * name 은 접근제한자를 두지 않았기에 변경이 가능
		 */
		ps.name = "길길동";
		
		/**
		 * salary는 private으로 막아뒀기에 변경이 불가하다
		 * 하지만 클래스 C01Person 내부에 Setter메소드를 작성함으로써 이를 이용해서 변경이 가능하다
		 * 이를 이용해 private으로 제한을 걸어 둔 변수들을 변경해보자
		 */
		
//		ps.salary = 9000;
		ps.setSalary(4500);
		ps.setId("123456-1234567");
		ps.setAge(55);
		
		System.out.println(ps.toString());
		
		//Getter로 각 변수의 값들을 불러와보기
		System.out.println("Getter 호출, Salary : " + ps.getSalary());
		System.out.println("Getter 호출, Age : " + ps.getAge());
		System.out.println("Getter 호출, Id : " + ps.getId());
		
	}
}
