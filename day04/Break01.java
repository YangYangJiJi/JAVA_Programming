package com.day04;

public class Break01 {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++)
		{
			if(i==5)continue;
			System.out.print(i+" "); 
			//continue는 이 조건이 만족하면 실행하지말고 반복문을 계속해. 그럼 5를 빼고 출력하는것처럼 보여짐
			
		} 
		
		
		/*int i=1;
		while(i<=10)
		{
			if(i==5)break; //4에서 끝나버림. 
			System.out.print(i+" ");
			i++;
		} */
		
		
		/*int i=1;
		while(i<=10)
		{
			if(i==5)continue; //얘는 for문과 다르게 멈춰버림. 마치 break같이. 무한루프가 됨.  
			System.out.print(i+" ");
			i++;
		}
			//while 문에서는 continue 못쓰나? 아님. 
			//멈춘 이유 : 증감치가 없어서.*/
			
		/*int i=0;
		while(i<10)
		{
			i++;
			if(i==5)continue; //이건 증감치가 위에 있기 때문에 가능.
			System.out.print(i+" ");
			//continue는 제외하고 출력한다는 개념을 제발 버리자. 
		}*/
	}
}

