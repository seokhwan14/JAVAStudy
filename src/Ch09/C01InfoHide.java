package Ch09;



class C02Person {
	//속성
	private String name;		//이름
	private String id;			//주민번호
	private int age;			//나이
	private float weight;		//무게
	private double height;		//키
	private int salary;			//급여
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}


public class C01InfoHide {
	public static void main(String[] args) {
		
		C02Person ps = new C02Person();
		
	}
}
