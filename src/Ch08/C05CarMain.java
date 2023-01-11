package Ch08;



public class C05CarMain {
	public static void main(String[] args) throws InterruptedException {
		
		C05Car car = new C05Car();
		car.owner = "홍길동";
		car.speed = 100;
		car.fuel = 120;
		car.model = "아반떼xd";
//		System.out.printf("차주 : %s, 현재속도 : %d, 연료량 : %d, 차종 : %s\n", car.owner, car.speed, car.fuel, car.model);
		
		
		car.info(); // C05Car 클래스에서 owner, speed, fuel, model 출력되는 메소드 작성
		
//		while(true) {
//			car.accel();
//			Thread.sleep(500);
//		}
		
		while(true) {
			car.breakk();
			Thread.sleep(500);
		}
		
	}
}
