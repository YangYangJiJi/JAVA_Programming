package com.day01;

import java.util.Scanner;

public class Ex05 {


	public static void main(String[] args) {

	Scanner s= new Scanner(System.in) ;
	System.out.print("이름 나이 키 독신여부 입력하세요 단 공백으로 입력"); //공백은 꼭 필요하다
	String name = s.next();
	int age = s.nextInt();
	double height =s.nextDouble();
	boolean single = s.nextBoolean();
	System.out.println(name+":"+age+","+height+","+single);
	

	/*System.out.print("문자하나입력");
	char ch = s.next().charAt(0);
	System.out.println("입력받은 문자 :"+ch);*/
	}
}
