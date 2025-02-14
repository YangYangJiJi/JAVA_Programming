package com.day16;

import java.io.FileOutputStream;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream out=null;
		try {
			out= new FileOutputStream("c:\\java\\out.txt");
			String str="이문자를 파일에 기록하고 싶습니다.";
			byte[] buf = str.getBytes();
			out.write(buf);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입출력오류");
		}
System.out.println("파일쓰기 완료");
	}

}
