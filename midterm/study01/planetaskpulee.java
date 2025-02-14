package midterm.study01; //과제풀이 //class Plane
// 속성 제조사 모델 고객수
//생성자, 디폴트 다 채워지는 생성자  //메서드 toString()
//static : 공유변수를 통해서 비행기수를 출력  //클래스 멤버변수 : 
class Plane1{
	private String product;
	private String model;
	private int customer;
	private static int planes = 0;
	public Plane1() 
	{
		this("에어부산", "ai100", 150); //this
	}
	public Plane1(String product, String model, int customer)
	{
		this.product=product;
		this.model=model;
		this.customer=customer;
		planes++;
	}
	@Override
	public String toString() {
		return "Plane1 [product=" + product + ", model=" + model + ", customer=" + customer + "]";
	}
	public static int getPlanes1() {
		return planes;
	}
}

public class planetaskpulee {

	public static void main(String[] args) {
		Plane1 p1 = new Plane1("아시아나", "A101", 150);
		Plane1 p2 = new Plane1("아시", "A112", 130);
		Plane1 p3 = new Plane1("제주항공", "J134", 111);
		System.out.println("현재운행되는 비행기개수는="+Plane.getPlanes());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		//밑에거를 통해서 한번에 출력가능
		// int [] num = {10, 20, 30} 이런거랑 똑같음.
		Plane1 [] p = {p1, p2, p3};  
		for(Plane1 list : p)
			System.out.println(list);
	}
}
