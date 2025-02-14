package com.day03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1~5 junsu random write");
		int su = s.nextInt();
		switch(su)
		{
		case 1:
			System.out.println("one");
			break; //break 빼버리면 에러는 안남. 위에것도 실행되고, 아래것도 실행된다. 이걸 의도적으로 이용할 수 있음.
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("many number");
			break; }
		
		/*System.out.print("1~5 junsu random write");
		int su = s.nextInt();
		switch(su)
		{
		case 1:
		case 2:
			System.out.println("small number"); //1,2 일때만 적은 수 
			break;
		default:
			System.out.println("many number");
			break;
		}*/
	}
}
