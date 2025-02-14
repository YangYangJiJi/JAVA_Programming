package com.day12;
//자동차에 기능을 주는 클래스 Car : 메서드 setSpeed() -> 속도를 입력받아 조종함
//인터페이스 : flying 메서드 fly()선언만함 / 날으는 기능.
//인터페이스 : driving 메서드 
 //1) 디폴트 메서드 : speed()  //2) drive() 선언
//FlyCar 클래스 정의 : Car 상속 인터페이스 다중상속 받아 운행시키기 
class Car {
	public void setSpeed(int speed) {
		System.out.println("자동차의 속도가 ="+speed+"로 변경되었습니다.");
	}
}
interface flying {
	public void fly();
}
interface driving{
	default public void speed(){ //디폴트 메소드만 인터페이스에서 예외적으로 쓸 수 있는 메소드임. 
		System.out.println("자동차가 규정속도 70km로 달리고 있습니다.");
	}
	public void drive(); //아무것도 정의안된 메소드
}

class Flycar extends Car implements flying, driving
{
	@Override
	public void drive() {
		System.out.println("자동차가 도로를 달리고 있습니다.");
	}
	@Override
	public void fly() {
		System.out.println("자동차가 날고있습니다.");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Flycar mycar = new Flycar();
		mycar.speed();
		mycar.setSpeed(100);
		mycar.fly();
		mycar.setSpeed(50);
	}
}
