package com.day14;
import java.util.ArrayList;
import java.util.Scanner;
//영어문자로 이름을 입력받아 ArrayList을 이용해서 추가하고 출력하세요
public class Ex03 {
	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<>();
		Scanner s= new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("이름입력:");
			String name=s.next();
			a.add(name);
		}
		for(String list : a)
			System.out.print(list+ " ");
	
		System.out.println("\n++++++++++각각의 문자열의 길이를 출력++++++++++++++");
		//문자열의 길이 알기 (ex: 유효성 검사, 4자 이상은 입력하실 수 없습니다.)
		for(int i=0;i<a.size();i++)
			System.out.print(a.get(i).length()+" ");
		//배열에서 사용하는 length()는 메소드이다. 속성이 아님. 문자열의 길이를 가져오는 메소드임
		//vector는 정수형이니까 그냥 길이출력이 아니라 정수 그자체를 가져와버린거임 
		
		//입력받은 이름중 가장 이름이 긴 사람의 이름을 출력해주세요 //시험문제 낼 수도 있음
		int max=0;
		for (int i=1;i<a.size();i++)
		{
			if(a.get(max).length()<a.get(i).length())//max(0번째요소)보다 첫번째요소가 더 크면 방을 바꿔버림 
				max=i;
		}
		System.out.println("\n 가장 길이가 긴 이름은="+a.get(max));
	}
}
