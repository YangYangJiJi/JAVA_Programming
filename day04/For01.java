package com.day04;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// for while do~while
		// 1부터 10까지 출력
		
		/*for(int i=1;i<=10;i++)
			System.out.print(i+" ");*/
		
		// 1부터 10까지 합을 구하기 
		/*int sum=0;  //초기화
		for(int i=1;i<=10;i++)
			sum=sum+i;
			System.out.println("1부터 10까지의 합="+sum);*/

		//구구단의 단을 입력하면 해당 구구단 표가 나옴 
		Scanner s= new Scanner(System.in);
		System.out.print("write dan : ");
		int dan = s.nextInt();
		int i=1;
		while(i<10)
		{
			System.out.println(dan+" * "+i+"="+(dan*i)); //반복치는 여기의 위 또는 아래
			i++;
		}
			
	}

}
