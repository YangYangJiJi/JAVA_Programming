package com.day13;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= new String(" c#");
		String b= new String(",c++");
		a = a.concat(b); //중요함. 뒤에 확장자 붙일 때도 씀. 그림파일 가져올때도 사용함   
		System.out.println(a);
		a=a.trim(); //공백을 제거하고 다시 a 방에 집어넣음. 그러면 공백이 제거됨//아이디 저장할 때 공백제거 // 중요함 
		System.out.println(a);
		a=a.replace("c#", "java"); //c#을 java로 바꿈 // 사원들을 다 대리로 바꿔줄 때, 이런경우 사용  // 중요함 많이쓰임
		System.out.println(a);
		//스플릿트 정말 중요함 //지금까지는 전부 컴마로 구별되어져 있음 
		String[] s = a.split(",");
		for(int i=0;i<s.length;i++)
			System.out.println("s["+i+"]="+s[i]);
		a=a.substring(5); //5번째 
		System.out.println(a);
		a=a.toUpperCase();
		System.out.println(a);
		char c=a.charAt(0);
		System.out.println(c);
	}
}
