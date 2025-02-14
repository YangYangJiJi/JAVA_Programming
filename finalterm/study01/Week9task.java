package finalterm.study01; //개인정보 주소 관리 프로그램
class Friend3 { 
	//원래는 class Friend extends object 인데 생략된거임. 이런 이유로 toString을 오버라이딩 할 수 있던 거였음.
	protected String name, phone, home; //private는 자식도 접근 막음.
	public Friend3 (String name, String phone, String home) {
		this.name=name;// 이렇게 부모클래스가 생성자로 정의되어있으면, 자식도 필수로 생성자로 정의되어야함.
		this.phone=phone;
		this.home=home;
	}
	public void showData() {
		System.out.println(name + ":" + phone + "," + home);
	}
}
class HighAlumni extends Friend3{
	private String job; 
	public HighAlumni (String name, String phone, String home, String job) {
		super(name, phone, home); 
		//부모의 생성자 모양과 똑같아야함. / 부모가 생성자로 정의되어 있기에 자식도 생성자로 정의해야함.
		/*super.name=name;
		super.phone=phone;
		super.home=home;*/
		this.job=job;
	}
	public void showData() {
		System.out.println(name + ":" + phone + "," + home + "(직업=" +job + ")" );
		/*super.showData()
		  System.out.println("(직업=" +job + ")");*/
	}
}
class UnivAlumni extends Friend3 {
	private String major;
	public UnivAlumni (String name, String phone, String home, String major) {
		super(name, phone, home);// 부모가 생성자로 정의되어 있기에 자식도 생성자로 정의해야함.
		this.major=major;
	}
	public void showData() {
		System.out.println(name + ":" + phone + "," + home + "(전공=" +major+ ")" );
	}	/*super.showData()
		  System.out.println("(전공=" +major + ")");
		 */
	//단축키 : 오른쪽 우클릭 > source > override/implement 눌러서 쉽게 추가 가능.
	//인터페이스의 특징 : 메소드를 주지 않는다. / 인터페이스는 일을 못하고, 이걸 상속받은 자식이 일을 해줘야함. 
	//이렇게 하면 인터페이스 도구와 이름 겹치는거 방지 가능.??
}
public class Week9task {
	public static void main(String[] args) {
		HighAlumni f1 = new HighAlumni("홍길동", "010-1111-1212", "부천", "공무원");
		//Friend f1 = new HighAlumni("홍길동", "010-1111-1212", "부천", "공무원"); 이렇게 해도 가능하다. (업캐스팅)
		//Hifreidn f1 = new Friend (다운캐스팅은 불가능)
		UnivAlumni f2 = new UnivAlumni("김철수", "010-1111-1111", "서울", "컴공");
		UnivAlumni f3 = new UnivAlumni("이영희", "010-2222-1111", "인천", "미콘");
		f1.showData();
		f2.showData();
		f3.showData();
		 /* Friend [] f= enw Friend[3];
		 * f[0] = new HighAlumni("홍길동", "010-1111-1212", "부천", "공무원");
		 * f[1] = new HighAlumni("홍길동", "010-1111-1212", "부천", "공무원");
		 * f[2] = new HighAlumni("홍길동", "010-1111-1212", "부천", "공무원");
		 * for(Friend list:f)
		 * 	list.showData(); //이때, 부모showdata, 자식showdata있을 땐 자식이 우선순위임. */
	}
}
