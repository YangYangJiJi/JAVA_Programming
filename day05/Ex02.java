package com.day05; // 하나의 문서에 public class 2개 올 수 없음. 밑에 계속 오는 public 은 함수 public 임
class Circle{ //속성이나 값은 멤버변수로 정의한다.  //동작은 메서드로 정의한다. 
			//circle은 다른 파일에서도 쓸 수 있음.
	//반지름과 이름이 존재하는 클래스 //반지름을 이용해 객체에 면적을 구해 돌려주는 함수 정의
	String name; //클래스는 객체를 통해 값을 부여함. //속성을 멤버변수로 정의함 
	double r;
	public double getArea(){
		return 3.14*r*r;
	} //출력하는 메서드를 정의해주세요
	
public void print(){
	System.out.println(name+" 's myun zuk is" + getArea());
}
}

public class Ex02 {

	public static void main(String[] args) {
		//Circle.naem="피자"; //절대안됨 //객체.메쏘드 로 함수호출해서 일 시킬거임
		//circle은 객체가 아닌 메소드. 그래서 클래스를 정의하는건 new 연산자를 통해 만듬
		Circle pizza = new Circle(); //디폴트 생성자는 아직 안배움. 그래서 괄호 안에 암것도 안쓰기
		pizza.name="javapizza";
		pizza.r=10.0;
		
		Circle dounut = new Circle();
		dounut.name = "cream dounut";
		dounut.r = 5.5;
		//System.out.println(pizza.name + " myun xuk is "+ pizza.getArea());
		//System.out.println(dounut.name + " myun xuk is "+ dounut.getArea());
		pizza.print();
		dounut.print();
	}
}
