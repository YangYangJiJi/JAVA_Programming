package com.day16;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in =null;
		try {
			in = new FileInputStream("c:\\java\\input.txt");
			//reader, writer는 2바이트라 한글이 깨지지 않지만, input, outputstream은 1바이트라 한글이 깨져버림 .영문자는 1바이트라 괜찮음
			int c;
			while((c=in.read())!=-1)
			{
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
		

	}

}
