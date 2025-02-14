package com.day06;
class Math //계산하는 메소드

{
//똑같은 이름의 메서드를 정의하고 매개변수의 타입과 개수를 다르게 오버로딩
//(메소드의 중복정의=메서드오버로딩)	
//정수 -> 정수제곱 / 실수 -> 실수제곱 / 정수 -> 곱하기
	public int square(int i)
	{
		return i*1;
	}
	public double square(double i) //이름이 square로 같아도 가능
	{
		return i*1;
	}
	//public int square(int i) //매개변수의 타입이 다르거나 개수가 달라야 함. 완전히 첫번째꺼랑 같아서 오류
	public int square(int i, int j)
	{
		return i*j;
	}
}

public class Overloading {

	public static void main(String[] args) {
		Math m1 = new Math();
		System.out.println("한개의 정수의 제곱값은"+m1.square(10));
		System.out.println("한개의 실수의 제곱값은"+m1.square(10.5));
		//이름이 같아도 알아서 찾아감. 안에 있는 매개변수의 타입이나 개수만 다르면 같은 이름 줘도 됨
		System.out.println("한개의 정수의 제곱값은"+m1.square(10));
	}

}
