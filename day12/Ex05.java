package com.day12;//다중상속 
//인터페이스 : 출력하는 Printable print() 메서드 선언 
//인터페이스 화면에 출력하는 Drawable draw() 메서드 선언
//다중상속 : 클래스 Circle 원을 출력할 때 화면에 출력하고, 인쇄해서 출력 둘다 
interface Printable{
	public void print();
}
interface Drawable{
	public void draw();
}

class Circle implements Printable, Drawable{ //다중상속이 가능함
	@Override
	public void draw() {
		System.out.println("화면에 원이 출력");
	}
	@Override
	public void print() {
		System.out.println("프린트로 출력 완료");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.draw();
		obj.print();
	}
}
