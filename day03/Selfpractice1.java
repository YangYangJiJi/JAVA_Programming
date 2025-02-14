package com.day03;

import java.util.Scanner;

public class Selfpractice1 {

	public static void main(String[] args) {
		// 과제 : 사칙연산하면 만들어지는 계산기 
		// if, else if, switch case 다 가능
		// 정수와 연산 입력받아야 하니까 3개가 변수, nextchar로 연산기호 입력받기
		int a, b;
		char giho;
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자는  : ");
		a = s.nextInt();
		System.out.print("두번째 숫자는 : ");
		b = s.nextInt();
		System.out.print("기호를 쓰세요 : ");
		giho = s.next().charAt(0);
		
		if(giho=='+')
			System.out.println(a+"+"+b+"="+(a+b));
		else if (giho=='-')
			System.out.println(a+"-"+b+"="+(a-b));
		else if (giho=='*')
			System.out.println(a+"*"+b+"="+(a*b));
		else if (giho=='/')
			System.out.println(a+"/"+b+"="+(a/b));
		else
			System.out.println("틀렸습니다.");
		
		//주의점 : System.out.println(a+"+"+b+"="+(a+b)); 쓸때 꼭 쌍따옴표로 써야함
		//그냥 따옴표 쓰면 이상한 값 나옴.
	}
}
