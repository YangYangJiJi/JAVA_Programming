package com.day04;

public class Gugudan02 {

	public static void main(String[] args) {
		
		for (int i=1;i<10;i++) //뒷자리
		{
			for (int j=1;j<10;j++) //앞자리
			{
				System.out.print(i+ "*" + j + "=" + (i*j));
				System.out.print('\t'); //한칸띄기
			}
			System.out.println(); //한줄 내리기 S
		}

	}

}