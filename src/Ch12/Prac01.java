package Ch12;


class ShopService {
	
	private static ShopService instance;
	
	public static ShopService getInstance() {
		if(instance == null) {
			instance = new ShopService();
		}
		return instance;
	}
	
	
	
}


public class Prac01 {
	public static void main(String[] args) {
		ShopService shop01 = new ShopService();
		ShopService shop02 = new ShopService();
		ShopService shop03 = ShopService.getInstance();
		ShopService shop04 = ShopService.getInstance();
		
		if( shop01 == shop02 ) {
			System.out.println("01, 02 같은 객체");
		}else {
			System.out.println("01, 02 다른 객체");			
		}
		
		if( shop01 == shop03) {
			System.out.println("01, 03 같은 객체");
		}else {
			System.out.println("01, 03 다른 객체");			
		}
		
		if( shop01 == shop04) {
			System.out.println("01, 04 같은 객체");			
		}else {
			System.out.println("01, 04 다른 객체");			
		}
		
		if(shop03 == shop04) {
			System.out.println("03, 04 같은 객체");						
		}else {
			System.out.println("03, 04 다른 객체");			
		}
		
		
		
	}
}
