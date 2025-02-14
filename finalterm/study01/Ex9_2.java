package finalterm.study01;

class Point{
	protected int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void show() {
		System.out.println(x+"+"+y);
	}
}

class Colorpoint extends Point{
	String color;
	public Colorpoint (int x, int y, String color) {
		super(x, y);
		this.color=color;
	}
	public void showColor() {
		System.out.println(color);
		show();
	}
}


public class Ex9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colorpoint cp = new Colorpoint(100, 200, "blue");
		cp.showColor();

	}

}
