package com.day09;
import java.util.Scanner;
//슈퍼클래스 Hero1을 정의 
//멤버변수 : name(이름)
//생성자 : 이름을 초기화 하는 생성자 정의
//toString 함수 이용해서 이름 반환
//서브클래스 Heroman 정의 -> 슈퍼클래스 Hero1을 상속받음
// --> 영웅의 이름, 무기 입력받아 각각 영웅들이 어떤 무기로 이동하는지를 정의 
// -> 멤버변수 : level(무기추가) / 생성자 : 이름과 무기 초기화하는 생성자정의 
//toString 함수 오버라이딩 하여 누가 어떤무기로 이동하는지 문자열 반환 
//메인클래스
//->객체배열이 3인 배열을 선언하고 영웅들의 이름과 무기를 입력받아 생성자를 통해 초기화하고 호출  

class Hero1{
	private String name;
	public Hero1(String name) {
		this.name=name; //초기화
	}
	@Override
	public String toString() { //부모의 toString
		return name;
	}
}
class HeroMan extends Hero1{
	private String level;
	public HeroMan(String name, String level) {
		super(name);
		this.level=level;
	}
	public String toString() {
		return super.toString()+" 이"+level+"로 이동";
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Hero1[] h = new Hero1[3]; //전화번호부같은경우는 [1000]정도를 줌 
		//지금 이건 객체를 만든게 아니라 3개를 만들거라고 선언한거임. 
		Scanner s = new Scanner(System.in);
		System.out.println("출동할 영웅의 이름과 무기를 입력 ");
		for(int i=0;i<h.length;i++)
		{
			System.out.println("영웅입력:");
			// h[i].name=""; 접근제한했기에 불가능 한 형태
			String name=s.next();
			System.out.print("무기입력:");
			String level=s.next();
			h[i]= new HeroMan(name,level);
		}
		for(Hero1 list: h)
			System.out.println(list);
	}
}
