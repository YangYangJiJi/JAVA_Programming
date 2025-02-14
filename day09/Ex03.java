package com.day09;
//부모클래스 : Man -> 멤버변수로 name가 dept(학과) / 메소드로 show() : 출력
//자식클래스 : Student->멤버변수로 grade(학년)출력 /
//Professor->멤버변수로 position(직위)출력, 메서드로 show():
//부모로 부터 상속받은 메소드를 재정의하는걸 메소드 오버라이딩 
//우리는 이미 toString으로 써봄.
//부모는 이름과 학과 // 자식은 +학년 출력 //교수는 +직위 출력 
//오버라이딩은 매개변수개수 이런 데이타 완전히 똑같아야함. 

class Man{
	String name;
	String dept; //학과이름
	public void show(){
		System.out.print(name+":"+dept);
	}
}
class Student extends Man{ //학생이 상속받음 //super.멤버변수 사용
	private int grade;
	//내꺼에는 name과 dept가 없음. 
	//부모에 있는 name과 dept를 갖다쓸거니까 super.멤버변수 사용 
	public Student(String name, String dept, int grade){
		super.name=name;
		super.dept=dept;
		this.grade=grade; //grade는 나만의 것. 부모에게는 없음. 
	}
	public void show(){ //오버라이드됨. 부모걸 재정의 함 
		super.show(); //이건 부모꺼 
		System.out.println("("+grade+"학년)"); //이걸 오버라이드해서 추가시킴.
	}
}
class Proffessor extends Man{
	private String position;
	public Proffessor(String name, String dept, String position){
		super.name=name;
		super.dept=dept;
		this.position=position;
	}
	public void show(){ //부모클래스를 재정의한 오버라이딩
		super.show();
		System.out.println("("+position+")");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Man m = new Man();//생성자가 없으니까 디폴트 생성자 가능
		Man s1 = new Student("홍길동", "컴공", 2);
		//상속을 받은 자식은 부모클래스로 객체를 인스턴스 시킬 수 있다.
		//부모클래스를 통해서 자식클래스를 객체화할 수 있다. 
		Student s2 = new Student("김수철", "경제학과", 3);
		Proffessor p1 = new Proffessor("박보검", "컴공", "조교수");
		Proffessor p2 = new Proffessor("김고은", "인공지능", "부교수");
		Man[] list= {s1, s2, p1, p2};
		//부모로부터 자식을 배열시킬 수 있다.
		for(Man mlist: list)
			mlist.show();
		}
	
	//정리
	//extends로 상속시킴 
	//부모가 접근제한 되었으면 
	//오버라이딩 -> 완전히 데이터가 똑같아야함. 부모자식관계만 이루어짐. 
	//내 클래스로 객체를 만드는게 기본이지만, 부모클래스로 자식을 객체화, 배열화 시킬 수 있다. 
	//부모클래스가 생성자로 정의되어있으면 이걸 상속받은 자식클래스는 반드시 생성자로 정의해야한다.
	//super로 호출 super.멤버변수 / super.메소드 
	//이게 추상. 인터페이스 연계되는거임 

}
