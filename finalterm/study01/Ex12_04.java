package finalterm.study01;

interface RemoteC1{
	void turnon();
	public void turnoff();
}

class Television1 implements RemoteC1{

	@Override
	public void turnon() {
		System.out.println("텔레비전 켜짐");
		
	}

	@Override
	public void turnoff() {
		System.out.println("텔레비전 꺼짐");
		
	}
	
}

class Refrigerator1 implements RemoteC1{

	@Override
	public void turnon() {
		System.out.println("냉장고가 켜짐");
		
	}

	@Override
	public void turnoff() {
		System.out.println("냉장고가 꺼짐");
		
	}
	
}

public class Ex12_04 {

	public static void main(String[] args) {
		RemoteC1 obj1 = new Television1();
		RemoteC1 obj2 = new Refrigerator1();
		obj1.turnon();
		obj2.turnon();
		obj1.turnoff();

	}

}
