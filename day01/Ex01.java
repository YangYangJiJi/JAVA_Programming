package com.day01;

public class Ex01 {
	
	public static void main(String[] args) {

	System.out.println("안녕하세요");
	System.out.println("홍길동");
	System.out.println("컴퓨터공학과");
	System.out.println(10+20);

		int a=10, b=100;
		double r=5; //int형인 5 (작은타입)을 큰 타입인 double로 변환
		r=10;
		final double PI= 3.14; //상수
		char ch='A';
		String s= new String("한국대학교");
		String s1= new String("한국대학교");
		System.out.println(a);
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println("정수의 자동형변환"+r);
		System.out.println(s.equals(s1));
		System.out.println("원넓이는"+(r*r*PI));
	}
}
