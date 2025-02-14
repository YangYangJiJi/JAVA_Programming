package com.day13; //패키지의 선언 

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="java"; //객체는 아님. s1은 변수이다. 
			String s1=new String("java"); //객체화시킴 
			String s2=new String("java");
			//if(s1==s2) // == 이거 쓰면 안됨. equals를 써야함 
			if(s1.equals(s2))
				System.out.println("두개의 문자열이 같습니다.");
			else
				System.out.println("두개의 문자열은 다릅니다.");
			//String은 클래스임 자바.length에 있는 		
	}
}
