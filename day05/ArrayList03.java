package com.day05;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {

	public static void main(String[] args) {
		//ArrayList 클래스를 이용해서 복권번호 5개를 랜덤하게 출력하기 
		//0번부터 45번까지
		//collections 라는 class의 shuff 메쏘드를 이용
			ArrayList<Integer> num = new ArrayList<>();
			for(int i=0;i<=45;i++) //num은 객체이다 
				num.add(i); // 0부터 45까지 저장
			for(Integer list : num)
				System.out.print(list+" ");
			
			Collections.shuffle(num);
			System.out.println("\n==============");
			for(Integer list : num)
				System.out.print(list+" ");
			System.out.println("\n 10 number of lotto");
			for(int i=0;i<11;i++)
				System.out.print(num.get(i)+ " ");
	}
}
