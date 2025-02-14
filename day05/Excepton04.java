package com.day05;

import java.io.FileReader;
import java.io.IOException;

public class Excepton04 {

	public static void main(String[] args) throws IOException { 
		//이렇게 걸어두면 에러원인은 모르지만 편함 
		try {
			FileReader fr = new FileReader("c:\\java123\\test.txt");
			char[] a = new char[100];
			fr.read(a);
			System.out.print(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
