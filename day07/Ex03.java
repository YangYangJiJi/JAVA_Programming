package com.day07;

import java.util.ArrayList;
import java.util.Scanner;

//name tel 저장하는 멤버변수 저장 //생성자 초기화 //toString() 출력
class Person{
	String name, tel;
	public Person(String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return name + ":" + tel ;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		//ArrayList class를 이용해 객체배열을 선언하고 추가
		ArrayList<Person> list = new ArrayList<>();
		//친구3명의 이름과 전화번호를 입력받아 추가하고 출력
		Scanner s= new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("이름과 전화번호 입력: ");
			String name=s.next();
			String tel=s.next();
			list.add(new Person(name,tel));
		}
		/*list.add(new Person("홍길동", "010-1111-2222"));*/
		//어레이 리스트는 [0]이런거 없고, (0)이런 요소값이다.//< > 안에는 클래스밖에 못온다.
		//객체배열을 선언한거지 객체를 만든건 아니다. 그래서 new 연산자 필요
		//객체를 만들 수 있는건 클래스이다.  //클래스이름 객체이름
		//꼭 Person 괄호 안에 써줘야 초기화 되는거다.
		System.out.println("친구들 전화번호 목록");
		for(Person obj : list)
			System.out.println(obj);
	}
}
