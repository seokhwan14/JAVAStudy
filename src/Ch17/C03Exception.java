package Ch17;

public class C03Exception {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {

			System.out.println("0");
			e.printStackTrace();
		} finally {
			System.out.println("1");
			System.out.println("2");
		}
	}
}
