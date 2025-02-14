package finalterm.study01;
class Item{
	int price;
}

class Noodle extends Item{
	public Noodle(){
		super.price=4000;
	}

	@Override
	public String toString() {
		return "국수";
	}
	
}

class MixNoodle extends Item{
	public MixNoodle(){
		super.price=5000;
	}

	@Override
	public String toString() {
		return "비빔국수";
	}
}

class Woodong extends Item{
	public Woodong() {
		super.price=4000;
	}

	@Override
	public String toString() {
		return "우동";
	}
}

class Buyer{
	private int money;
	public Buyer (int money) {
		this.money=money;
	}
	public void buy(Item it, int count) {
		System.out.print(it+"를 "+count+"개 먹었습니다.");
		money=money - (it.price*count);
		System.out.println("남은 돈은"+money);
	}
}

public class Ex11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer (20000);
		buyer.buy(new Noodle(), 2);
		buyer.buy(new Woodong(), 1);

	}

}
