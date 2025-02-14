package com.day13.app;

import com.day13.lib.Calculator;

//실제로 계산이 작동되는 부분 
public class GoodCal extends Calculator{ //아까 만든 추상클래스인 calculator를 임포트 시켜야 쓸 수 있음 
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}
	@Override
	public String toString() {
		return "계산프로그래밍";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCal obj = new GoodCal();
		System.out.println(obj.add(100,200));
		System.out.println(obj.substract(100,200));
		System.out.println(obj.getClass()); //get도 안가져와도 나옴 
		System.out.println(obj.hashCode()); // 안가져와도 나옴
		System.out.println(obj.toString()); //toString 정의 안함. 그래도 나옴 
	}
}
