package midterm.study01;
//circle 클래스 //반지름과 이름이 존재하는 클래스
//반지름을 이용해 객체에 면적을 구해 돌려주는 함수 정의
//출력하는 함수도 정의 : 이름의 면적은 면적이다.
class Circle{
	String name;
	double r;
	public double getArea() {
		return 3.14*r*r;
	}
	public void print() {//출력하는 메서드 
		System.out.println(name+"의 면적은 "+getArea());
}
}


public class Mid3 {

	public static void main(String[] args) {
		//객체를 만들어 일을 시켜야 한다. 객체 생성은 new 연산자로
		Circle pizza = new Circle();
		pizza.name="javapizza"; //객체.변수 
		pizza.r=10.0;
		
		Circle dounut = new Circle();
		dounut.name="cream dounut";
		dounut.r=5.5;
		
		pizza.print(); //객체.메소드
		dounut.print();
	}

}
