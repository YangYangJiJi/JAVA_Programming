package midterm.study01;
//피자토핑  //토핑이 늘어날때마다 출력값도 늘어나기
class Pizzza{
	private String topping;
	private static int count=0;
	public Pizzza(String toppping) {
		this.topping=topping;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public String toString() {
		return topping + "피자";
	}
}
public class Mid13 {

	public static void main(String[] args) {
		Pizzza p1= new Pizzza("슈프림");
		Pizzza p2 = new Pizzza("치즈");
		Pizzza p3 = new Pizzza("어니언");
		System.out.println("피자 토핑은" + p1);
		System.out.println("지금까지 팔린 피자수는"+Pizzza.getCount());

	}

}
