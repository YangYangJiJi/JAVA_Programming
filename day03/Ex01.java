package com.day03;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		//세개의 정수를 입력받아 총점과 평균을 출력(평균은 소수점자리까지)
Scanner s = new Scanner(System.in);
System.out.print("세개의 정수입력");
int kor = s.nextInt();
int eng = s.nextInt();
int math = s.nextInt();
int sum = kor+eng+math;
double avg=(double)sum/3;
System.out.println("세정수의 합 = "+sum);
System.out.println("평균은="+avg);
	}
}
