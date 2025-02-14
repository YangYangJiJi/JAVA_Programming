package com.day03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		//4,6,9,11 -> 30일까지
		//1,3,5,7,8,10,12 -> 31일까지
		//2 -> 28일까지
			Scanner s = new Scanner(System.in);
			System.out.print("Write month");
			int month = s.nextInt();
			int day;
			switch(month)
			{
			case 2:
				day=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				break;
			default: // 제일 경우의수가 많은 것을 디폴트로 둬야 컴퓨터 속도가 빨라짐
				day=31;
				break;
	}
			System.out.print(month+"month have"+day+"days");
}
}
