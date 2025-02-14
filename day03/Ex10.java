package com.day03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

				Scanner s= new Scanner(System.in);
				System.out.print("Write score");
				int score = s.nextInt();
				
				switch(score/10)
				{
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				default: 
					System.out.println("F");
					break;
		}
	}
}

