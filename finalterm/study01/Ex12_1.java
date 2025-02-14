package finalterm.study01;

abstract class Animal{
	private String name;
	public Animal(String name) {
		this.setName(name);
	}
	abstract public void move();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Mammal extends Animal{
	private int leg;
	public Mammal (String name, int leg) {
		super(name);
		this.leg=leg;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"가" +leg+"의 다리로 달리고 있습니다.");
	}
}

class Bird extends Animal{
	private int wing;
	public Bird (String name, int wing) {
		super(name);
		this.wing=wing;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"가" +wing+"의 날개로 날고 있습니다.");
	}
}


public class Ex12_1 {

	public static void main(String[] args) {
		Animal obj1 = new Mammal("사자",4);
		Animal obj2 = new Mammal("강아지",4);
		Animal obj3 = new Bird("독수리",2);
		Animal[]a= {obj1, obj2, obj3};
		for(Animal list : a)
			list.move();

}
}
