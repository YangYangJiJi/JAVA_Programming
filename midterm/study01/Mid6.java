package midterm.study01;
//클래스 피자 정의 
//상태 : 피자의 크기(size), 종류(type), 사이드(side)
//동작 : 출력하는 메서드 : 콤비네이션의 크기는 10인치
//생성자는 피자의 크기와 종류를 다 초기화하는 생성자 정의 : 제일 많이 팔리는 콤비네이션 12인치
class Pizza{
	int size; String type, side;
	public Pizza() {
		this (12, "combination", "there is no side menu");
		//아래에 꽉 채워진게 있기에 가능함.
	}
	public Pizza(int size, String type, String side) {
		this.size=size;
		this.type=type;
		this.side=side;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", type=" + type + ", side=" + side + "]";
	}
	
}
public class Mid6 {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza(15, "Supream", "");
		Pizza p3 = new Pizza(20,"","cola");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
