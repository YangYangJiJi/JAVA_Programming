package com.day03;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
	System.out.print("사과와 포도의 개수를 입력하세요");
	int a = s.nextInt();
	int b = s.nextInt();
	int result = (a>b)? a-b:b-a; //만약 a가 더크면 a-b 하고, 아니라면 b-a를 해라.
	System.out.println("두수의 차는 :" + result); 
	
		/*int a=10,b=15;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(a&b)+","+(a&b));
		System.out.println(Integer.toBinaryString(a|b)+","+(a|b));
		System.out.println(Integer.toBinaryString(a^b)+","+(a^b)); //같은 비트는 무조건 0
		System.out.println(Integer.toBinaryString(a&b)+","+(a&b));
		System.out.println(Integer.toBinaryString(~a)+","+(~a));*/
	}

}
