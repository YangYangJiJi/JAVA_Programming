package finalterm.study01;

abstract class Drink1{
	protected String name;
	public abstract void ordering();
}

class Beer1 extends Drink1{
	private int price;
	public Beer1(String name) { //생성자 추가 
		super.name=name;
		this.price=5000;
	}
	@Override
	public void ordering() {
		System.out.println(name+"의 가격은"+price);
	}
}

class Coffee1 extends Drink1{
	private int price;
	public Coffee1 (String name) {//생성자
		super.name=name;
		this.price=3000;
	}
	@Override
	public void ordering() {
		System.out.println(name+"의 가격은"+price);
	}
}

class MixCoffee1 extends Drink1{
	private int price;
	public MixCoffee1(String name) {
		super.name=name;
		this.price=4000;
	}
	@Override
	public void ordering() {
		System.out.println(name+"의 가격은"+price);	
	}	
}
public class Ex12_3 {

	public static void main(String[] args) {
		Drink1 d1 = new Beer1 ("테라");
		Drink1 d2 = new MixCoffee1 ("카페라떼");
		Drink1 d3 = new Coffee1 ("아메리카노");
		Drink1 [] d = {d1, d2, d3};
		for (Drink1 list:d) //Drink1 클래스에 대한 for문인데, list라는 매개객체? 쓸거고, d배열 가져올거다.
			list.ordering(); //객체.메소드
		
	}

}
