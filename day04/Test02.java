package com.day04;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아 합을 출력 (단 음수값을 제외하고 합계를 출력)
		Scanner s= new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print("write number : ");
			int n = s.nextInt();
			if(n<=0)continue; //0보다 작으면 더하지 마
			else 
			sum=sum+n; //만약 0보다 크면 더할거야.
		}
		System.out.println("sum of number is ="+ sum);
	}

}
