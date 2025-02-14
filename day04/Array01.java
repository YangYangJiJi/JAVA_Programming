package com.day04;

public class Array01 {

	public static void main(String[] args) {
		//10개의 정수를 저장할 수 있는 배열을 선언하고, 각각 방에 1부터 10까지 저장하고 출력
		
int [] num = new int[10]; //int형 배열을 만들거고, 배열이름은 num 이고, 그 크기는 10이야.


//<for each문으로 같은거 반복>
int sum=0;
for(int i=0;i<10;i++)  //for(int i=0;i<num.length;i++) 도 가능 
	num[i]=i+1;

for(int i=0;i<10;i++)
	System.out.println("num["+i+"]="+num[i]); //그냥 모양 꾸미기 

for(int n : num)
	sum=sum+n;
	System.out.print("배열에 저장된값="+sum); 
System.out.println("");

	
/*String [] s= {"apple","banana","grape","mango"};
for (int i=0;i<s.length;i++)
	System.out.print(s[i]+ " ");*/

String [] s={"apple","banana","grape","mango"};
for (String fruit:s)
	System.out.print(fruit+" "); //전체를 받아와서 전체를 찎어버림. //위에거랑 똑같은 결과나옴 
}
}//배열은 무조건 0번째 부터 시작함,
