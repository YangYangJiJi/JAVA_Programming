package com.day05;

public class Exception02 {

	public static void main(String[] args) {
		//0번부터 5개의 배열을 저장, arraylist 사용 x 
		int [] num = new int [5];
		try { 
			for(int i=0;i<=num.length;i++)
			{
				num[i]=i+1;
			}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("size is so small");
	}
		
		for(int list : num)
		System.out.print(list+" ");

	}

}

	