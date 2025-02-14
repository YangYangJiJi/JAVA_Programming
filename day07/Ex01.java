package com.day07;
//클래스 : circle
//속성(=state, 상태) : 반지름 (1부터 10까지인 원을 배열로 정의)
//생성자 : 1부터 10까지 반지름 값을 초기화하는 생성자 정의
//생성자는 클래스와 이름과 동일함. 반환형태가 없다. 
//동작 : 원의면적을 반환해주는 
//객체배열을 선언해서 생성하여 (new 연산자 쓰지 않으면 선언만하는거)
//원의 면적을 출력 

class Circle{
	double r; //3.14로 곱해야 하니까 더블
	public Circle(double r){ //반지름을 초기화하는 생성자//객체를 초기화하는 목적
		this.r=r; //위의 두개의 r을 같다고 설정해줌.
	}
	public double getArea(){
		return 3.14*r*r;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Circle [] c = new Circle[10];
		//시험 : null, 0, false 로 초기화 됨.
		//배열은 0부터 시작 -> 초기화는 1크게 설정해야 함 //렝쓰는 메소드가 아니라 속성
		for (int i=0;i<c.length;i++)
			c[i]=new Circle(i+1); //1부터 10까지를 생성자로 초기화함
		for(Circle obj : c)//for each
			System.out.println("원의 면적은 : "+ obj.getArea());
	}
}
