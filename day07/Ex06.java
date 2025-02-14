package com.day07;
class Pizza
{
	private String topping; //토핑 알려주는 코드
	private static int count =0; //토핑 추가할때마다 갯수 늘어남. 초기값은 0
	public Pizza(String topping)//생성자
	{
		this.topping=topping;
		count++;
	}
	public static int getCount()
	{
		return count;
	}
	//static으로 지정한 멤버변수를 메서드로 정의할때는 반드시 그 메서드로 static으로 지정해야함 
	@Override
	public String toString() {
		return topping + "피자";
	}
}//토핑만 generate toString으로 찍어봄

public class Ex06 {

	public static void main(String[] args) {
		Pizza p1=new Pizza("슈프림");
		Pizza p2=new Pizza("치즈");
		Pizza p3=new Pizza("페퍼로니");
		System.out.println("피자 토핑은 "+ p1);
		//static 없으면 객체를 만들때마다 0에서 하나씩만 증가함. //그래서 p3의 개수만 세어진거임.
		System.out.println("지금까지 팔린 피자의 수는 "+ Pizza.getCount());
		//유일하게 클래스로 접근할 수 있는게 static을 붙인 멤버변수와 메소드이다. 
	}
}
