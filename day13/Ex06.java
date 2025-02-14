package com.day13;

import java.sql.Timestamp;
import java.util.Calendar;

public class Ex06 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //겟인스턴스 
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR)+"년"); 
		//비효율적인 방법 //캘린더 쓰지 말라는 것을 알려주기 위해 쓰는거임 
		//calendar 까먹기. 그냥 실습은 함 

		Timestamp now = new Timestamp(System.currentTimeMillis());
		//타임스탬프는 sequrity와 sql 두 군데에 있음. 우리는 sql로 가져와야함 
		System.out.println(now);
		//날짜는 타임스탬프가 훨씬 더 효율적이다. 
	}
}
