package com.day05;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		//젯수와 피젯수를 입력받아 그 수로 나누기 연산을 수행 
		Scanner s = new Scanner(System.in);
		System.out.print("write getsu");
		int x = s.nextInt();
		System.out.print("write pee getsu");
		int y = s.nextInt();
		try {
			int result= x/y;
			System.out.println("the divide result is : " + result);
		} catch (ArithmeticException e) {
			System.out.println("you can't divide by zero");
			
		}
		
		//제수에 10, 피젯수에 0을 입력하면 예외가 발생함. exception처리하면 해결됨. 

	}

}
