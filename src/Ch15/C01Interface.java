package Ch15;


interface Remocon {
	
	//인터페이스의 field - final static이 기본값이다
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//기능 - 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int vol);
}

class Tv implements Remocon {
	
	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원 On");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원 Off");		
	}

	@Override
	public void setVolume(int vol) {
		if(vol >= MAX_VOLUME) {
			vol = MAX_VOLUME;
			System.out.println("볼륨이 최대입니다.");
		}else if (vol <= MIN_VOLUME) {
			vol = MIN_VOLUME;
			System.out.println("볼륨이 최소입니다.");
		}else {
			this.vol = vol;
		}
		System.out.println("현재 볼륨 : " + vol);
	}
	
}

class Radio implements Remocon {

	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("Radio 전원 On");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio 전원 Off");		
	}

	@Override
	public void setVolume(int vol) {
		if(vol >= MAX_VOLUME) {
			vol = MAX_VOLUME;
			System.out.println("볼륨이 최대입니다.");
		}else if (vol <= MIN_VOLUME) {
			vol = MIN_VOLUME;
			System.out.println("볼륨이 최소입니다.");
		}else {
			this.vol = vol;
		}
		System.out.println("현재 볼륨 : " + vol);
	}
	
}


public class C01Interface {
	
	public static void TurnOn(Remocon controller) {
		controller.turnOn();
	}
	public static void TurnOff(Remocon controller) {
		controller.turnOff();
	}
	public static void setVol(Remocon controller, int num) {
		controller.setVolume(num);
	}
	
	
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		Radio rd = new Radio();
		
		TurnOn(tv);
		setVol(tv, 0);
		
	}
	
}
