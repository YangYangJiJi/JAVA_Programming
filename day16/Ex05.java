package com.day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("c:\\java\\input.txt"));
		String str;
		while(true)
		{
			str=in.readLine();
			if(str==null)break;
			System.out.println(str); //ln해도 됨. 어차피 한줄씩 가져오는 것이기에 
		}
		in.close(); //파일관련 클래스로 작업할 때는 습관적으로 닫아줘야함
	}

}
