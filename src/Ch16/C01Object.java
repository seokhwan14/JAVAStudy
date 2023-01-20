package Ch16;


class A {
	int x;
	int y;
	
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
}

public class C01Object {
	public static void main(String[] args) {
		Object obj = new Object();
		
		
		System.out.println(obj.hashCode());
		System.out.printf("%x\n", obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj);
		System.out.println(obj.toString());
		
		
		System.out.println();
		System.out.println();
		
		A obj02 = new A();
		System.out.println(obj02.hashCode());
		System.out.printf("%x\n", obj02.hashCode());
		System.out.println(obj02.getClass());
		System.out.println(obj02);
		System.out.println(obj02.toString());
		
		System.out.println();
		System.out.println();

		//Upcasting
		Object obj03 = new A();			
		System.out.println(obj03.hashCode());
		System.out.printf("%x\n", obj03.hashCode());
		System.out.println(obj03.getClass());
		System.out.println(obj03);
		System.out.println(obj03.toString());
		
		
		
	}
}
