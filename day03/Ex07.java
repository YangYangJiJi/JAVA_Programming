package com.day03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//3개의 정수 입력받아서 가장 큰 수 구하기 
		Scanner s = new Scanner(System.in);
		System.out.print("Three jugsu write");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		/*if(a>b)
		{	if(a>c)
				System.out.println(a+" is best big");
			else
				System.out.println(c+"is best big");
		}
		else 
		{	if(b>c)
				System.out.println(b+"is best big");
			else 
				System.out.println(c+"is best big");
		}*/
		
		int result;
		if(a>b)
			result=(a>c)?a:c; //a가 b보다도크고 c보다도 커? 그럼 답은 a, 아니면 c
		else
			result=(b>c)?b:c;
		
	System.out.println("most big jungsu is "+result);

}
}
