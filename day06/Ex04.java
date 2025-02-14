package com.day06;
//클래스 Pizza 정의 //문자열을 반환해주는 메서드 정의
//상태 : 피자의 크기 size 라는 변수, 종류(type)이라는 변수
//동작 : 출력하는 메서드 정의 . '콤비네이션의 크기는 10인치 입니다.'
//생성자는 피자의 크기와 종류를 다 초기화하는 생성자 정의 : 제일 많이 팔리는 콤비네이션 12인치

class Pizza{
	int size;
	String type, side;
	public Pizza(){
		this(12, "combination","there is no side menu");
		//아래에 꽉 채워진게 있기에 가능 
	}
	public Pizza(int size, String type){
		this();
		this.size=size;
		this.type=type;
	}
	public Pizza(String type, String side){
		this(); //this 생성자는 맨 위에 써야함 
		this.type=type;
		this.side=side;
	}
	public Pizza(int size, String type, String side){
		this.type=type;
		this.size=size;
		this.side=side;
	}
	public String toString(){
		return type + " of" +size + "inch order("+side+")";
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza(15, "Supream");
		Pizza p3 = new Pizza(15, "bulgogi","spagetti");
		Pizza p4 = new Pizza("potato","salade");
		System.out.println(p1.toString());
		System.out.println(p2); //원래 존재하는 함수이기에 toString 생략해도 잘됨
		System.out.println(p4);
	}
}
