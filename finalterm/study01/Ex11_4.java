package finalterm.study01;
abstract class Shape{
	abstract public void draw();
	abstract void Area(double a, double b);
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그리는 기능");
	}

	@Override
	public void Area(double a, double b) {
		System.out.println("원의 면적은="+ (3.14*a*a));
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("사각형을 그리는 기능");
	}

	@Override
	public void Area(double a, double b) {
		System.out.println("사각형의 면적은="+ (a*a));
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그리는 기능");
	}

	@Override
	public void Area(double a, double b) {
		System.out.println("삼각형의 면적은="+ (a*a)/2);
	}
}


public class Ex11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s2 = new Circle();
		Shape s3 = new Rectangle();
		Shape s4 = new Triangle();
		Shape[]a= {s2, s3, s4};
		for (Shape list : a) {
			list.draw();
			list.Area(5.0, 5.0);
		}
	}

}
