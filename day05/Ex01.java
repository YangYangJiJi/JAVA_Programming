package com.day05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//과제: 5개의 정수를 입력받아 배열에 저장하고 for each문으로 출력해주세요
		//5개의 정수의 합과 평균을 출력 
		
		// 과제 풀이 
		
		Scanner s = new Scanner(System.in);
		int [] num = new int[5]; //배열의 크기를 쓴거임 0번째방부터 4번째 방까지의 방을 뜻함 
		int sum=0;
		System.out.println("write 5 number");
		for(int i=0;i<num.length;i++) //자바는 i<=num.length 이렇게 하면 안됨. 배열의 크기는 크기이기 때문에 등호 쓰면 안됨 
		{
			System.out.print((i+1)+"bun zza number write");
			num[i]=s.nextInt();
			//sum=sum+num[i];  여기까지만 쓰는것도 가능하긴 하지만 우리는 for each문 쓸거임 
		}
		for(int list:num)  // list:num 은 배열을 받아옴 
			sum=sum+list;
		System.out.println("your number's sum is " + sum);
		System.out.println("averge is "+sum/num.length); //배열의 길이만큼 나눠줌 sum/num.length여기에 
														//괄호치면 소수점 뒷자리가 안나오기때문에 안됨
	}
}
