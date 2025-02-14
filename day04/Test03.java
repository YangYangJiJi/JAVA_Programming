package com.day04;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//정수를 입력받아 짝수인지 홀수인지 판별 (0을 입력하면 프로그램 종료)
		//while(true) : while에서 무한루프 쓰는 방법 
		
		Scanner s= new Scanner(System.in); //값을 입력받아야 하니까 가져옴
		while(true)
		{
			System.out.print("wirte number");
			int num = s.nextInt();
			if(num==0)break;
			else if (num%2==0)
				System.out.println("zzack su");
			else 
				System.out.println("hol su");
				
		}
			
		System.out.println("end");		

	}

}
