package com.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//좋아하는 운동종류를 저장하는 ArrayList클래스를 이용해 입력받아 4개 항목을 추가하세요
//for each문을 활용하여 출력해주세요
Scanner s = new Scanner(System.in);
ArrayList<String> list = new ArrayList<>();
System.out.println("write 4 exercise list");
for(int i = 0;i<4;i++)
{
	System.out.println("write:");
	list.add(s.next()); //입력받음
}
System.out.println("my favorite sports is ");
for(String sports : list)
	System.out.print(sports+" ");
System.out.println("\n my favorite sports ="+list.get(0));
	}

}
