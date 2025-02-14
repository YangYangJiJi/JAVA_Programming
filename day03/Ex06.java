package com.day03;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("jungsu write");
	int su = s.nextInt();
	if(su>0)
		System.out.println("yangsu"); //10입력시 나옴
	else if(su==0)
		System.out.println("zero");
	else
		System.out.println("umsu"); 
	//-10입력시 나옴.하지만0일때는 정확한 값이 나오지 않으니까 else if 문으로 써야함
	
		
	//정수 입력받아서 짝수인지 홀수 인지 
	/*System.out.print("jungsu write");
	int su = s.nextInt();
	if(su%2==0)
		System.out.println("zzacksu");
	else
		System.out.println("holsu");*/
	
	
	//점수를 입력해서 90점 이상이면 a, 80점 이상이면 b 등등 
	/*System.out.print("jumsu write");
	int su = s.nextInt();
	if(su>=90)
		System.out.println("A");
	else if(su>=80)
		System.out.println("B");
	else if(su>=70)
		System.out.println("C");
	else 
		System.out.println("F");*/

	}

}
