package Ch08;

public class C06Computer {
	
	String SerialNO;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	/**
	 * SerialNO의 전원을 켭니다
	 */
	void PowerON() {
		System.out.println(SerialNO + " 부팅중...");
	}
	
	/**
	 * 모든 멤버변수를 출력합니다.
	 */
	void ShowInfo() {
		System.out.printf(SerialNO + "의 정보 - 시리얼넘버 : %s, CPU스펙 : %s, RAM스펙 : %s, DISK스펙 : %s\n",
				SerialNO, CPUSpec, RAMSpec, DISKSpec);
	}
	
	/**
	 * SerialNO의 전원을 끕니다.
	 */
	void PowerOFF() {
		System.out.println(SerialNO + " 종료중...");
	}
}
