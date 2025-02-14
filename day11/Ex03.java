package com.day11; //정말정말정말 좋은예제. 다형성을 표현한 실용적인 프로그래밍
//다형성 구형하는 대표적인 예제
//item클래스 : 메뉴판 -> price(멤버변수)
//자식1 : noodle //자식2 : mix noodle //자식3 : woodong
//셋다 toString으로 이름반환해줌.
//생성자 초기화가 아니라 그냥 초기화. 정하고 시작함.
//사먹는 애 : Buyer / money(멤버변수), 생성자로 초기화(내 돈이 얼마나 있는지), buy(메뉴이름, 가격)
//메뉴이름이랑, 개수, 남은 돈 
//메뉴이름은 : 매개변수가 Item it이됨 / Item it = new Noodle()
class Item { 
	int price;
}
class Noodle extends Item {
	public Noodle()
	{
		super.price=4000;
	}

	@Override
	public String toString() { //왜 toString썼는지 이해해야함. 
		return "국수";
	}
}
class MixNoodle extends Item {
	public MixNoodle() {
		super.price=5000;
	}

	@Override
	public String toString() { //왜 toString썼는지 이해해야함. 
		return "비빔국수";
	}
}

class Woodong extends Item {
	public Woodong() {
		super.price=4000;
	}

	@Override
	public String toString() { //왜 toString썼는지 이해해야함. 
		return "우동";
	}
}

class Buyer {
	private int money;
	public Buyer (int money) {
		this.money=money;
	}
	//buy메소드정의 : 어떤 메뉴를 몇개 먹었고, 남은 돈이 얼마인지 출력하는 메서드 
	public void buy(Item it, int count){ //중요
		System.out.print(it+"를  "+count+"개 먹었습니다.");
		money = money - (it.price*count);
		System.out.println("남은 돈은"+money);
	}
}
//시험문제에 낼거임 
//Buyer b = new Buyer(2000)
//b.buy(new woodong(), 2
public class Ex03 {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(20000);
		buyer.buy(new Noodle(), 2);
		buyer.buy(new Woodong(), 1);
	}
}
