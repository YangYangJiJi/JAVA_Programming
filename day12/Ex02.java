package com.day12;
//사칙연산 기능만 선언. 배열로 받아서 평균 구하기 
//abstract class Calcutor{
interface Calcutor{
	abstract public int add(int a, int b); //일반클래스를 정의하지 않을거면 abstract붙어야 함
	abstract public int substract(int a, int b); //메소드 선언만 하는 것임 
	abstract public double average(int[] a); 
	//이렇게 추상메소드로 정의되어 있기에 interface로 해도 됨 
}
public class Ex02 implements Calcutor{ //추상클래스를 상속받았기에 반드시 구현해줘야함 
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) { //배열에 저장된 값의 평균을 반환
		int sum=0; //0으로 초기화
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		return (double)sum/a.length; //강제형변환 
	}
	public static void main(String[] args) {
		Ex02 obj= new Ex02();
		System.out.println(obj.add(10, 5));
		System.out.println(obj.substract(10, 5));
		System.out.println(obj.average(new int[] {10, 20, 30, 40}));
	}
}
