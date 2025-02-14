package finalterm.study01;
class Man{
	String name;
	String dept;
	public void show() {
		System.out.println(name+":"+dept);
	}
}
class Student extends Man {
	private int grade;
	public Student (String name, String dept, int grade) {
		super.name=name;
		super.dept=dept;
		this.grade=grade;
	}
	public void show() {
		super.show();
		System.out.println(grade+"학년");
	}
}

class Proffessor extends Man{
	private String position;
	public Proffessor (String name, String dept, String position) {
		super.name=name;
		super.dept=dept;
		this.position=position;
	}
	public void show() {
		super.show();
		System.out.println(position);
	}
}
public class Ex9_3 {

	public static void main(String[] args) {
		Man m = new Man();
		Man s1 = new Student("홍길동","컴공",2);
		Student s2 = new Student ("김수철", "경제학과", 3);
		Proffessor p1 = new Proffessor ("박보검", "컴공","조교수");
		Proffessor p2 = new Proffessor ("김고은", "인공지능", "부교수");
		Man[] list= {s1, s2, p1, p2};
		for(Man mlist : list)
			mlist.show();

	}

}
