package com.day01;

import java.util.Scanner;

public class Ex04 {


	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in); //sca만 치고 컨트롤+스페이스바 누르면 자동으로 import 줄이 생김.
		//import 줄 미리 칠 필요가 없음.
		System.out.print("첫번째 정수 입력");
		a = s.nextInt();
		System.out.print("두번째 정수 입력");
		b=s.nextInt();
		System.out.println("두정수의 합의 결과:"+(a+b));
		System.out.println("두정수의 차의 결과:"+(a-b));
		}
}
