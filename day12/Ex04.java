package com.day12;
//(책에 없음)인터페이스로 리모컨 만듦. On/OFF 메소드 선언
//이 인터페이스를 상속받은 Television 클래스. Refrigerator
interface RemoteC{
	//아무것도 정의되지 않은 메서드들로만 구성
	// =일반멤버변수가 올 수 없다. 단, final이라는 상수값만 올 수 있다.)
	//  =생성자, 일반메서드 전부 못온다. 
	public void turnon(); //메소드 정의
	public void turnoff(); //메소드 정의
}

class Television implements RemoteC{
	@Override
	public void turnon() {
		System.out.println("텔레비전 켜짐");
	}

	@Override
	public void turnoff() {
		System.out.println("텔레비전 꺼짐");
	}
}

class Refrigerator implements RemoteC{
	@Override
	public void turnon() {
		System.out.println("냉장고가 켜짐");
	}
	@Override
	public void turnoff() {
		System.out.println("냉장고가 꺼짐");
	}
}
public class Ex04 {

	public static void main(String[] args) {
		RemoteC obj1 = new Television();
		RemoteC obj2 = new Refrigerator();
		obj1.turnon();
		obj2.turnon();
		obj1.turnoff();

	}

}
