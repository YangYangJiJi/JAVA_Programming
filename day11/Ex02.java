package com.day11;
//할아버지 : 부모클래스 Car 멤버변수 oil(기름량)
//아빠 : 자식클래스 Car 상속받은 Hibrid 멤버변수 elec (전기량)
//나 : 자식클래스 Hibrid 상속 Hwater 멤버변수 water(수소량)
//모든 클래스는 생성자로 초기화 출력하는 메서드 disp() 오버라이딩 
//자바는 기본적으로 다중상속 허락하지 않는다. 유일하게 다중상속을 허용하는게 인터페이스임.
class Car {
	private int oil;
	public Car(int oil) {
		this.oil=oil;
	}
	public void disp() {
		System.out.println("남은 기름량은 = " + oil);
	}
}

class Hibrid extends Car{ //만들자마자 에러나는 이유 : 아직 자식 생성자를 쓰지 않아서.
	private int elec;
	public Hibrid(int oil, int elec) {
		super(oil);
		this.elec=elec;
	}
	@Override
	public void disp() {
		super.disp();
		System.out.println("잔여전기량 =" + elec);
	}
}

class Hwater extends Hibrid{
	private int water;
	public Hwater(int oil, int elec, int water) {
		super(oil, elec);
		this.water=water;
	}
	@Override
	public void disp() {
		super.disp();
		System.out.println("잔여수소량은 =" + water);
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Car c1 = new Car(20);
		Car c2 = new Hibrid(50,50);
		Car c3 = new Hwater(20,30,40);
		Car[] c = {c1, c2, c3};
		for(Car list : c)
			list.disp();
		
	}

}
