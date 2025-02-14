package midterm.study01;

//변동금리 
class Kbank {
	private String name;
	private double money;
	private static double rate;
	public Kbank(String name, double money, double r) {
		this.name=name;
		this.money=money;
		rate=r;
	}
	public String toString() {
		return "이름"+name+"입금액"+money+"이율"+rate;
	}
}

public class Mid14 {

	public static void main(String[] args) {
		Kbank k1 = new Kbank("홍길동" , 2000.0 , 0.1);//초기화
		System.out.println(k1);
		System.out.println("+++++++++");
		
		Kbank k2 = new Kbank("김철수" , 3000.0 , 0.3);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println("+++++++++");
		
		Kbank k3 = new Kbank("이영희" , 1000.0 , 0.5); //이율이 점점 올라감
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3); 
		System.out.println("+++++++++");

	}

}
