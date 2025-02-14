package com.day06;
//가로와 세로의 값을 가지고 있는 클래스 Rectangle을 정의하고
//동작은 가로*세로 하여 값을 돌려주는 메쏘드 getArea() 정의하고
//객체를 생성하여 면적을 출력
class Rectangle //렉탱글은 일을하는애가 아닌 설계도이다. 틀일 뿐이다. 
				//객체를 만들어야 일을 시킬 수 있음 
{
	int width; //상태를 멤버변수로 표현한것 
	int height; 
	public int getArea()//함수는 반환, 즉 돌려주는 것 //클래스 앞의 퍼블릭과 이 퍼블릭은 다름 
						//동작 : 메서드
	{
		return width*height;
	}
	//public double getArea() -> 이렇게만은 안됨
	
}

public class Ex02 {

	public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	//Rectangle.width //클래스에 일을 시킬 수 없음, 예외적으로 다음주에 배울 스태틱 정적 하면 되긴함
	r1.width=10; //'객체.멤버변수=값' 이렇게 일을 시킬 수 있음.  
	r1.height=5;
	System.out.println("myeon juk of rectangle is"+r1.getArea());
	
		

	}

}
