package finalterm.study01;
class Bumo{
	protected String mosu;
	/*public Bumo (String mosu) {
		this.mosu=mosu;
	}*/
	public void momethod() {
		System.out.println(mosu+"출력");
	}
}
class Zasik extends Bumo{
	String zasu;
	public Zasik(String mosu, String zasu) {
		super.mosu=mosu;
		this.zasu=zasu;
	}
	public void momethod() {
		System.out.println(mosu+zasu+"출력");
	}
}

public class TestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bumo a = new Zasik ("A", "B");
		Zasik b = new Zasik ("C", "D");
		Bumo[]list = {a,b};
		for(Bumo k : list)
			k.momethod();

	}

}
