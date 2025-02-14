package com.day03;

import java.util.Scanner;

public class Selfpractice2 {

	public static void main(String[] args) {
		
		int a, b;
		char giho;
		Scanner s = new Scanner(System.in);
		System.out.print("first number  : ");
		a = s.nextInt();
		System.out.print("second number : ");
		b = s.nextInt();
		System.out.print("write giho  : ");
		giho = s.next().charAt(0);
		
		switch(giho)
		{
		case '+' : 
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-' : 
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*' : 
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/' : 
			System.out.println(a+"/"+b+"="+((double)a/b));
			break;
		default :
			System.out.println("wrong number");
		}
	}
}
