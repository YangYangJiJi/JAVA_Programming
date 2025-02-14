package com.day11;
//부모클래스 Shape : draw()메서드를 아무일도 안하는 추상메소드로 정의. -> abstract라는 추상화시키는 명령어 사용
//추상메소드는 반드시 추상클래스에 정의해야함.
//자식클래스 Circle, Rectangle, Triangle

abstract class Shape { //진짜 아무일도 안하겠다고 선언.
	abstract public void draw();
	abstract void Area(double a, double b);
	//클래스에 따라서 면적을 구하는 방법이 달라지기에 여기서 무슨 정의를 하는건 아무 의미가 없음. 
	//나 아무것도 안할거라는 선언을 해줘야함 = 추상화메소드 정의 = abstract
	//일반클래스니까 여기다가 abstract void Area(double a, double b) 쓰면안됨. 
	//추상메서드 정의
	// 1. 아무것도 정의되지 않는 메서드이고 예약어는 abstract로 정의
	 //2. 추상메서드는 일반클래스에 정의할 수 없다. (반드시 추상클래스에 정의해야한다.) 인터페이스와 추상클래스에만 들어간다. 
	 //아무것도 구현되지 않는 껍데기 메소드
	//3. 추상메서드를 쓰는이유 : 지는 일을 안하고 자식클래스에게 일을 시키기 위한 것 
	//추상메서드를 상속받은 서브클래스들은 반드시 추상메서드를 구현해줘야함 (오버라이딩).
	//추상클래스는 자기자신을 객체화할 수 없다. (중요)
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그리는 기능"); //아무의미없음
	}

	@Override
	public void Area(double a, double b) {
		System.out.println("원의 면적은 = "+ (3.14*a*a));
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("사각형을 그리는 기능");//아무의미없음
	}

	@Override //source > implement 
	public void Area(double a, double b) {
		System.out.println("사각형의 면적은 = "+ (a*a));
	}
}
class Triangle extends Shape {
	public void draw() {
		System.out.println("삼각형을 그리는 기능");//아무의미없음
	}

	@Override
	public void Area(double a, double b) {
		System.out.println("삼각형의 면적은 = "+ (a*a)/2);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		//Shape s1 = new Shape(); -> 에러남. //추상클래스는 자기자신을 객체화시킬 수 없다.
		Shape s2 = new Circle();
		Shape s3 = new Rectangle();
		Shape s4 = new Triangle();
		Shape[] s = {s2, s3, s4};
		for(Shape list : s) {
			list.draw();
			list.Area(5.0, 5.0);
		}
	}
}

//추상클래스 정의
//1. 추상메서드를 포함하고 있는 클래스가 추상클래스 
//2. 추상클래스는 반드시 추상메서드를 포함할 필요는 없음. 근데 보통 추상클래스는 추상메서드를 포함하긴함.
//3. 추상클래스는 자기자신을 객체화 할 수 없고, 자식클래스를 객체화하여 구현한다. 
//4. 추상클래스와 인터페이스의 차이점 : 추상클래스는 일반변수, 생성자, 일반메서드와 같이 정의할 수 있다. 다 올수 있음. 인터페이스는 불가능 
//ex : 추상클래스 안에 double a, b; 이런거 들어가도 됨. 
//인터페이스는 무조건 추상메소드만 가지고 있는 것임. 추상메소드 이외의 것이 들어가면 안됨. 

//목적 : 다형성을 구형하기 위해. 자식클래스가 껍데기인 부모걸 가져가서 다른걸로 구현하도록 함. 
//이걸 상속받은 자식클래스 : 좋든 싫든 추상클래스를 상속받았으면, 꼭 추상메소드를 반드시 implement(구현)해줘야함.
