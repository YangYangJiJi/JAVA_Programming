package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("c:\\java\\americano.jpg");
		FileOutputStream out = new FileOutputStream("c:\\java\\song1.jpg");
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		in.close();
		out.close();
		System.out.println("복사가 완료");
		

	}

}
