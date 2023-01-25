package Ch18;

//호빵의 재료로 선정할 class들은 해당 클래스를 상속받아야 한다
abstract class HoppangMeterial {
	
}


class Ppat extends HoppangMeterial{
	String meterial;
	Ppat(String meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "팥 [meterial = " + meterial + "] ";
	}
}

class Vegi extends HoppangMeterial{
	String meterial;
	Vegi(String meterial) {
		this.meterial = meterial;
	}
	@Override
	public String toString() {
		return "채소 [meterial = " + meterial + "] ";
	}
}

class Pizza extends HoppangMeterial{
	String meterial;
	Pizza(String meterial) {
		this.meterial = meterial;
	}
	@Override
	public String toString() {
		return "피자 [meterial = " + meterial + "] ";
	}
}

class Mint{
	String meterial;
	Mint(String meterial) {
		this.meterial = meterial;
	}
	@Override
	public String toString() {
		return "치약맛 [meterial = " + meterial + "] ";
	}
}

class Hoppang<T extends HoppangMeterial>{
	private T meterial;
	Hoppang(T meterial) {
		this.meterial = meterial;
	}
	
	void ShowInfo() {
		System.out.println(meterial.toString() + "으로 만든 호빵");
	}
}


public class C01Generic {
	public static void main(String[] args) {
		Hoppang<Ppat> ppatHoppang = new Hoppang<Ppat>(new Ppat("단팥"));
		ppatHoppang.ShowInfo();
		
		Hoppang<Vegi> vegiHoppang = new Hoppang(new Vegi("채소"));
		vegiHoppang.ShowInfo();

		Hoppang<Pizza> pizzaHoppang = new Hoppang(new Pizza("피자"));
		pizzaHoppang.ShowInfo();
		
		//Generic Type을 HoppangMeterial 상속 받지 않은 민초는 재료에 포함될 수 없다
//		Hoppang<Mint> mintHoppang = new Hoppang(new Mint("민초"));
//		mintHoppang.ShowInfo();
	}
}
