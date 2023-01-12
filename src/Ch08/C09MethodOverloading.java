package Ch08;

public class C09MethodOverloading {
	public static void main(String[] args) {
		
		
		C09Simple obj = new C09Simple();
		int result = obj.sum(10, 10);
		System.out.println("Result1 : " + result);
		
		int result02 = obj.sum(10.0, 20.0);
		System.out.println("Result2 = " + result02);
		
		int result03 = obj.sum(10, 20, 30);
		System.out.println("Result3 = " + result03);
		
		int result04 = obj.sum("RandomName", 10, 20);
		System.out.println("Result4 = name : " + obj.name + ", result : " + result04 );
	}
}
