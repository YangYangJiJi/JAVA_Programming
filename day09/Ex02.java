package com.day09;
//부모클래스 : Point 멤버변수 / x,y좌표 / 메서드: 좌표를 출력하는 show()
//자식클래스 : Point 상속받는 ColorPoint만들거임 / 좌표는 상속받음 
//멤버변수는 좌표와 색깔을 출력하는 ShowColor()
//상속받는 이유 : 재정의 하기 싫어. 
//근데 부모클래스를 접근 제한하면(private) 생성자 초기화하거나 getter setter하는 방법이 있음
//하지만 생성자 만드는 순간 칼라포인트는 무조건 에러남. 
//너무 중요 : 내가 받은 부모클래스가 생성자로 정의되어있으면, 나는 무조건 생성자로 정의해야함.
//1. 부모클래스가 생성자로 정의되어있으면 이걸 상속받은 자식클래스는 반드시 생성자로 정의해야한다. (약속)

class Point{
	protected int x, y; //디폴트 생성자 
	//접근제한자 protected : 자식클래스까지는 허용하는 제한. 
	//private : 자식도 허용을 안함.
	
	public Point(int x, int y){
		this.x=x;
		this.y=y; //포인트를 상속받은 자식은 무조건 에러남. 
	}
	
	public void show() {
		System.out.println("("+x+")"+","+"("+y+")");
	}
	
}
class Colorpoint extends Point {
//포인트클래스를 상속받는 컬러포인트 클래스 
//언제든지 부모클래스에 있는걸 상속받을 수 있는 extends 
	String color;
	public Colorpoint(int x, int y, String color){
		super(x, y); 
		this.color=color;
		//같은 클래스에서 또다른 클래스의 생성자를 쓸때 this를 썼다면
		//부모클래스가 생성자로 정의되어 있으면, 자식도 생성자로
		//부모클래스의 생성자를 자식에서 호출할때는 super를 써야함. 
	}
	public void showColor() {
		System.out.println(color);
		show(); //super.show();의 생략된 형태  //super.메서드
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Colorpoint cp= new Colorpoint(100, 200, "blue");
		cp.showColor();
		
		/*cp.color="red";
		cp.x=10; //상속 받았기에 가능함
		cp.y=10; //상속
		cp.showColor(); //상속
		cp.show(); //상속 */
	}
}
