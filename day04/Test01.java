package com.day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//초기값이 없는 무한루프
		//정수를 입력받아 입력받은 값들의 합을 출력
		//단 조건 : 0을 입력하면 반복문을 종료함.
		//출력결과 : 몇개의 정수를 입력받았는지, 그리고 그 합계가 얼마인지 
		//break쓰지않고 하기. 
		
		Scanner s= new Scanner(System.in);
		int sum=0;
		int count=0;
		System.out.print("wirte number");
		int n = s.nextInt(); 
		
		while(n!=0) 
		{
			count++;
			sum=sum+n;
			n=s.nextInt();
			
		}
		if(count==0)
			System.out.println("there is no wirte");
		else
		System.out.println("you write"+count+"gea and sum is"+sum);
		 //여기서 쓴 if else는 디테일임.
	System.out.println("you write 0 so programm is end");
	
	//사실 break를 쓰면 더 쉽다. 
	//c언어 안배우고 온 사람이 있기때문에 그리고 고정관념을 깨고 싶기에 일부러 break안쓰고 해봄.
	}
}
