package com.day12;
//부모클래스 : 추상클래스 / String / 멤버변수 : name : protected
//추상메소드 : move클래스  
//자식클래스 : Mammal 멤버변수 leg : private
//자식클래스 : Birds 멤버변수 wing : private
//자식클래스 private이기에 생성자로 초기화해야함. 
//메소드 오버라이딩으로 자식클래스에서 부모클래스를 구현해줘야함 
//move() 오버라이딩 4개의 다리로 달리고 있습니다. 2개의 날개로 날고있습니다. 
//객체를 3~4개를 인스턴스화 하여 출력해주세요

abstract class Animal {
	protected String name; //생성자 안줘도 됨. private아니라면 생성자 안해도 됨 
	abstract public void move(); 
	//아무것도 정의 안하고, 아무일도 안하는 추상메소드 
	  //-> 추상클래스안에 있어야 하기에 abstract class Animal이 되어야 함	
}

class Mammal extends Animal{ //오버라이드로 부모거를 자식에서 구현해줘야 함. 
	private int leg;
	public Mammal(String name, int leg) {
		super.name=name; //생성자로 정의
		this.leg=leg;
	}
	@Override
	public void move() {
		System.out.println(name+"가"+leg+"의 다리로 달리고 있습니다.");
	}
}

class Birds extends Animal{ //오버라이드로 부모거를 자식에서 구현해줘야 함. 
	private int wing;
	public Birds(String name, int wing) {
		super.name=name; //생성자로 정의
		this.wing=wing;
	}
	@Override
	public void move() {
		System.out.println(super.name+"가"+wing+"의 날개로 날고 있습니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Animal obj1 = new Mammal("사자",4); 
		//추상클래스는 자기자신을 객체화 시킬 수 없다. 자식을 통해서 객체화는 할 수 있ㄷ. 
		Animal obj2 = new Mammal("강아지",4);
		Animal obj3 = new Birds("독수리",2);
		Animal [] obj = {obj1, obj2, obj3};
		for(Animal list : obj)
			list.move();
		
		/*Animal [] obj = new Animal[4];
		obj[0] = new Mammal("사자",4);
		obj[1] = new Mammal("강아지",4);
		obj[2] = new Birds("독수리",2);
		try  {
			for(Animal list : obj)
				list.move();
		} catch (Exception e) {
			System.out.println("++++++++++++++++++");
			System.out.println("출력완료");
		}
		for(Animal list : obj)
			list.move();
		-> 방이 남음. 에러는 아니지만 예외가 발생함. 
		-> try catch로 처리하면 됨. */
		
		//교재 294쪽 / 교안 25페이지 
		//멤버변수, 생성자 이런거 없고, 추상메소드로만 있으면 추상클래스보다 인터페이스를 쓰는게 더 좋다. 
		//추상클래스와 인터페이스의 차이점 : 추상클래스는 일반멤변수, 추상메소드 다 같이 써도 되지만, 
		//인터페이스는 추상메소드로만 구성되어있음 
	}
}
