package com.day03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args){
	// 나이를 입력받아 성년인지 미성년자인지 출력(조건연산자 사용)
	Scanner s = new Scanner(System.in);
	System.out.print("Your age?");

	int age = s.nextInt();
	String result = (age>19)?"adult":"child";
	System.out.println("You are"+result); 
	
	}
}
