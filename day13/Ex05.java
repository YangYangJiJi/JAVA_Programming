package com.day13;

public class Ex05 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this"); //lang에 있어서 import안시켜도 됨 
		//ex04에서는 문자를 바로 못붙였음. 여기에서는 문자를 바로 붙일 수 있음 
		//지금 중요한건 append임
		sb.append(" is pencil");
		System.out.println(sb); //맨앞에 띄어쓰기가 사라짐 
		sb.insert(7, " my"); //7번째에 my라는 글자 추가 
		System.out.println(sb);
		sb.replace(8, 10, "your"); //8번째부터 10번째 (3자리를)를 your로 바꿈 
		System.out.println(sb);
		sb.delete(8, 10); //8번째 부터 10번째 전까지 자리를 지움 
		System.out.println(sb);
	}
}
