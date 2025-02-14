package com.day07;
class Kbank //진짜 static을 쓰는 이..유.. 변동금리
{
	private String name;
	private double money;
	private static double rate; //금리
	//private double rate; 로 하면 고정금리인데,static 만 붙였더니 변동금리됨.
	//이게 static의 중요특징 : 객체를 만들때마다 값을 공유하게됨 -> 마지막에 바뀐걸로 자기도 바뀜.
	public Kbank(String name, double money, double r)//생성자
	{
		this.name=name;
		this.money=money;
		rate=r;
	}
	@Override
	public String toString() {
		return "이름=" + name + "입금액" + money + "이율" + rate;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Kbank k1 = new Kbank("홍길동" , 2000.0 , 0.1);//초기화
		System.out.println(k1);
		System.out.println("+++++++++");
		
		Kbank k2 = new Kbank("김철수" , 3000.0 , 0.3);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println("+++++++++");
		
		Kbank k3 = new Kbank("이영희" , 1000.0 , 0.5); //이율이 점점 올라감
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3); 
		System.out.println("+++++++++");
	}
}
