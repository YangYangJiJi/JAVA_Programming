package midterm.study01;
//클래스 circle
//속성 : 반지름 (1부터 10까지인 원을 배열로 정의)
//생성자 : 1부터 10까지 반지름 값을 초기화하는 생성자 정의
//생성자는 클래스의 이름과 동일함. 반환형태가 없다.
//동작 : 원의 면적을 반환해주는 /객체배열을 선언해서 생성하여/원의 면적을 출력 

class Circle1{
	double r;
	public Circle1(double r) {//객체를 초기화 하는 목적
		this.r=r;
	}
	public double getArea() {
		return 3.14*r*r;
	}
}
public class Mid8 {

	public static void main(String[] args) {
		Circle1 [] c=new Circle1[10];//배열 생성 
		for(int i=0;i<c.length;i++) 
			c[i]=new Circle1(i+1); //1부터 10까지를 생성자로 초기화함 
		for(Circle1 obj : c) //for each
			System.out.println("원의 면적은 : " + obj.getArea());
	}

}
