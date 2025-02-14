package com.day12;
//ox문제 기말고사 8개 나옴. 전체 2점
//추상클래스는 반드시 추상메소드를 포함해야 한다? xxxxxxx 없어도 됨 
abstract class Drink{
	protected String name;
	public abstract void ordering(); 
	//abstract위치는 아무데나 상관없음 맨앞아니어도 됨 
}

class Beer extends Drink{
	private int price;
	public Beer(String name) {
		super.name=name;
		this.price=5000; //5000으로 초기화
	}
	@Override
	public void ordering() {
		System.out.println(name+"의 가격은"+price);
	}
}
class Coffee extends Drink{
	private int price;
	public Coffee(String name) {
		super.name=name;
		this.price=3000;
	}
	@Override
	public void ordering() {
		System.out.println(name+"의 가격은"+price);
	}
}
class MixCoffee extends Drink{
	private int price;
	public MixCoffee(String name) {
		super.name=name;
		this.price=4000; //4000으로 초기화
	}
	@Override
	public void ordering() {
		System.out.println(name+"의 가격은"+price);
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Drink d1= new Beer("테라"); //추상클래스는 자기자신을 객체화 시킬 수 없다. 
		Drink d2= new MixCoffee("카페라테");
		Drink d3= new Coffee("아메리카노");
		Drink [] d = {d1, d2, d3};
		for (Drink list :d)
			list.ordering();
	}
}
