package com.day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedWriter out = new BufferedWriter(new FileWriter("c:\\java\\buffer.txt"));
		out.write("자바의 버퍼를 연습합니다.");
		out.newLine();
		out.write("파일의 버퍼에 저장하는 연습입니다.");
		out.newLine();
		out.write("버퍼에 저장된 파일을 수행하겠습니다");
		out.newLine();
		out.close();
		System.out.println("파일쓰기 완료");

	}

}
