package com.day06;

import java.util.Scanner;

class Rectangle1{ //클래스 이름이 똑같으면 안되기에 여기서는 렉탱글1으로 준다. 
	double width; //상태를 멤버변수로 표현한것 
	double height; 
	public Rectangle1(int w, int h){ //초기화 
		width=w;
		height=h;
	}
	//public Rectangle(int w, int h) -> 안에 매개변수까지 똑같은거는 못가져온다. 
	public Rectangle1 (double w, double h){ //자동형변환 -> 작은걸큰데에다 넣기가능
		width=w;
		height=h;
	}
	public double getArea(){//함수는 반환, 즉 돌려주는 것 //클래스 앞의 퍼블릭과 이 퍼블릭은 다름 	 
		return width*height;//동작 : 메서드 //여기의 public은 생략해도 가능
	}
	public double getArea(double i, double j){
		return i*j;
	}
}

public class Ex03 {

	public static void main(String[] args) {
	Rectangle1 r1 = new Rectangle1(10,20); //생성자가 단하나라도 정의되어 있으면 디폴트 생성자 호출 불가
	//그래서 10,20 써주어 초기화 시킴    //10은 w가, 20은 h가 받아감 
	Rectangle1 r2 = new Rectangle1(10.5,20.5); 
	Scanner s = new Scanner(System.in);
	
	System.out.println("사각형의 면적은"+r1.getArea());
	System.out.println("실수값의 사각형면적은 "+r1.getArea(10.5, 5.5));
	}
} 
