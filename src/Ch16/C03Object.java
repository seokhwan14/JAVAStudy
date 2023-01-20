package Ch16;

class Employee {
	String id;
	String name;
	int salary;
	Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * equals를 재정의하여 id와 salary값이 같으면 true, 아닐 경우 false를 반환하도록 만들기
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee down = (Employee)obj;
			return (this.id == down.id) && (this.salary == down.salary);
		}else {
			return false;
		}
	}
}


public class C03Object {
	public static void main(String[] args) {
		Employee per1 = new Employee("1010","홍길동",5000);
		Employee per2 = new Employee("2020","ASDF",6000);
		Employee per3 = new Employee("1010","홍길동",5000);
		
		System.out.println("per1과 per2의 비교값 : " + per1.equals(per2));
		System.out.println("per1과 per3의 비교값 : " + per1.equals(per3));
		System.out.println("per2와 per3의 비교값 : " + per2.equals(per3));
		
	}
}
