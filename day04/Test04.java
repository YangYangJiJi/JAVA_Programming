package com.day04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//5개의 정수를 입력받아 배열에 저장하고 최대값을 출력
	Scanner s= new Scanner(System.in);
	int [] n = new int[5];
	System.out.println("write first number : ");
	n[0] = s.nextInt();
	int max =n[0]; //첫번째 입력받은 정수값으로 max를 초기화 시킴. 
	for(int i=1;i<n.length;i++)
	{
		System.out.print((i+1)+"bun zza write: ");
		n[i]=s.nextInt();
		if(max<n[i])
			max=n[i];
	}
		
System.out.println("the most bigger number is : "+max);
		
	}

}
//교재 133페이지 
//모두 마이너스 값일 때를 생각하면 max=0이 되면 안됨. 