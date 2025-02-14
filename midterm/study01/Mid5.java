package midterm.study01;

import java.util.Scanner;

//가,세,높의 값을 입력받아서 사각형의 면적을 구하는 메소드 만들기
class Nemo{
	double width;
	double height;
	public Nemo(int w, int h) {//생성자 형성 / 초기화
		width=w;
		height=h;
	}
	public Nemo(double w, double h) {//생성자 형성 초기화
		width=w;
		height=h;
	}
	public double getArea() {
		return width*height;
	}
	public double getArea(double i, double j) {
		return i*j;
	}
}

public class Mid5 {

	public static void main(String[] args) {
		//Nemo r1=new Nemo(); //생성자가 하나라도 정의되어 있으면 디폴트생성자 불가능
		Nemo r1 = new Nemo(10,20);
		Nemo r2 = new Nemo(10.5,20.5);
		Scanner s = new Scanner(System.in);
		
		System.out.println("사각형의 면적은 " + r1.getArea());
		System.out.println("실수값의 사각형 면적은 "+ r1.getArea(10.5, 5.5));
	}

}
