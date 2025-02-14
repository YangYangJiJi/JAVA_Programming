package com.day09;
//쓰잘데기 없다는 걸 보여주는 예제
//부모클래스 : hero / 멤버변수는 name / 메서드 : move()
//자식클래스 : Superman Spiderman Batman / 멤버변수 : level(무기)
    //메서드 오버라이딩 : move() -> 움직임
//둘다 생성자로 초기화
class Hero{
	protected String name;
	public Hero(String name) {
		this.name=name;
	}
	public void move(){
		System.out.println(name+"이동~~~~~");
	}
}
class Superman extends Hero {
//1. extends를 통해 상속받음 
//2. 부모클래스가 생성자로 정의되어있기에 자식클래스도 생성자로 정의해야함. 
//일단 부모클래스에 있는 생성자를 호출해야함.  
	String level;
	public Superman(String name, String level) {
		super(name); //디폴트생성자불가능
		this.level=level;
	}
	public void move() {
		System.out.println(name+"이"+level+"로 이동");
	}
}

class Batman extends Hero {
	String level;
	public Batman(String name, String level) {
		super(name); //디폴트생성자불가능
		this.level=level;
	}
	public void move() {
		System.out.println(name+"이"+level+"로 이동");
	}
}

class Spiderman extends Hero { 
	String level;
	public Spiderman(String name, String level) {
		super(name); //디폴트생성자불가능
		this.level=level;
	}
	public void move() {
		System.out.println(name+"이"+level+"로 이동");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Hero h1 = new Hero("영웅");
		h1.move(); 
		//Superman h1 = new Superman("슈퍼맨", "망토"); hero로 객체화시키는것가능
		Hero h2 = new Superman("슈퍼맨", "망토"); //이것의 우선순위는 superman
		Hero h3 = new Batman("배트맨", "오토바이");
		Hero h4 = new Spiderman("스파이더맨", "거미줄");
		Hero[] hero = {h1, h2, h3, h4};
		for (Hero list : hero)
			list.move();
	}
}
