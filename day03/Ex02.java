package com.day03;

public class Ex02 {
	
	public static void main(String[] args){
	/*int a=10,b=5;
	System.out.println(a+"-"+b+"="+(a-b)); //사칙연산자
	System.out.println(a+"*"+b+"="+(a*b));
	System.out.println(a+"/"+b+"="+(double)a/b); 
	System.out.println(a+"를"+b+"로 나눈 나머지 값"+(a%b));
	
	System.out.println((a>=b)); //관계연산자,true
	System.out.println((a<=b)); //false
	System.out.println(a==b); //false
	System.out.println(a!=b); //true 
	
	System.out.println((a==10)&&(b==10)); //f
	System.out.println((a==10)||(b==10)); //true
	System.out.println(!(a==10)); //f  //not연산자는느낌표로표시*/
		
	int a=10;
	int b=(a++)+1;  // b=11 이 되고, a=11이 된다.
	System.out.println(a++); //11
	System.out.println(a); //10
	System.out.println(--b); //먼저 마이나마이나를 하라는뜻.그래서 10이 됨.
	}
}
