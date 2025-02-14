package com.day04;

public class Gugudan01 {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) //for문은 원래 블럭안쓰는데 여러개 쓸 땐 꼭 써주기
		{
			for(int j=1;j<=9;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j)); 
			}
			System.out.println(" "); //그냥 단 구분 용 
			
		}

		
		
		
		
		
		
		//5단과 9단을 제외하고 출력하되, 단보다 곱해지는 수가 커지면 종료
		//반드시 continue와 break를 사용해서 
		
		
		for (int i=2;i<9;i++)
		{
			if(i==5 || i==9)continue;
			for(int j=1;j<=9;j++)
			{
				if(j>i) break; //등호는 쓰면안됨.
			}
		}
		
		
		
	}

}
