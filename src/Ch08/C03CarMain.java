package Ch08;



public class C03CarMain {
	public static void main(String[] args) {
		
		C03Car car = new C03Car();
		car.owner = "홍길동";
		car.speed = 0;
		car.fuel = 100;
		car.model = "아반떼xd";
		System.out.printf("차주 : %s, 현재속도 : %d, 연료량 : %d, 차종 : %s\n", car.owner, car.speed, car.fuel, car.model);
		
		
	}
}
