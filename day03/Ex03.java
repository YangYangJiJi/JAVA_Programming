package com.day03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args){
		
//하나의 상자에 사과가 10개씩 포장하겠습니다. 사과의 개수를 입력받아 몇개의 박스와 
//나머지 사과의 개수를 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("사과의 개수를 입력하세요");

		int su = s.nextInt();
		int result = su/10;
		int result1 = su%10;
		
		System.out.println(result+"박스"); 
		System.out.println(result1+"개");
		
	}
}
