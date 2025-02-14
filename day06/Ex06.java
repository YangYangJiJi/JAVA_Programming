package com.day06;
class Box
{
	int w, h ,d; //가로 세로 높이
	public Box(){
		this(1,1,1);
	}
	
	public Box(int w, int h){
		this(); // 꼭 호출해야함 
		this.w=w;
		this.h=h;
	}
	
	public Box (int w, int h, int d){
		this.w=w; //다 꽉 채워진 생성자 존재 
		this.h=h;
		this.d=d;
	}
	
	public void print(){
		System.out.println("상자의 면적은" + (w*h*d));
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Box b1= new Box(10,10); 
		Box b2= new Box(10,10,10);
		b1.print();
		b2.print();
	}

}
