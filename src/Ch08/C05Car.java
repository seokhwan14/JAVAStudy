package Ch08;

public class C05Car {

	
	String owner;
	int speed;
	int fuel;
	String model;
	
	void info() {
		System.out.printf(owner + "님의 차 정보 - 차주 : %s, 차 속도 : %d, 차 연료 : %d, 차 모델명 : %s\n", owner, speed, fuel, model);
	}
	
	void breakk() {
		if( speed - 10 <= 0 ) {
			System.out.println("차가 정지했습니다. 현재 속도 : 0km/h");
			speed = 0;
		}else {
			speed = speed - 10;
			System.out.println(owner + "님의 차 감속, 현재 속도 : " + speed + "km/h");
		}
	}
	
	void accel() {
		if(fuel - 5 <= 0 ) {
			System.out.println("연료가 부족합니다. 충전 필요, 현재 연료 : " + fuel);						
		}else if (speed >= 200 ) {
			speed = 200;
			System.out.println("최고속도 200km/h 입니다. 가속 불가");			
		}else {
			fuel = fuel - 5;
			speed = speed + 10;			
			System.out.println(owner + "님의 차 가속, 현재 연료 : " + fuel + "현재 속도 : " + speed);
		}
	}
	
	void check() {
		System.out.println("현재 속도 : " + speed + ", 현재 연료 : " + fuel);
	}
}
