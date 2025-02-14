package com.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException{
		DataInputStream in=null;
		DataOutputStream out = null;
		out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("c:\\java\\dat.bin")));
		out.writeBoolean(false);
		out.writeDouble(3.14);
		out.writeInt(100);
		out.writeUTF("자기자신을 사랑하자");
		
		out.flush(); //새로고침
		in=new DataInputStream(new BufferedInputStream(new FileInputStream("c:\\java\\dat.bin")));
		System.out.println(in.readBoolean()); //블룬에 해당하는 걸 읽어오겠다
		System.out.println(in.readDouble()); // 더블에 해당하는 걸 읽어오겠따.
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
		in.close();
		out.close();
	}
}
