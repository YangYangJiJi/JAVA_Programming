package midterm.study01;

import java.util.ArrayList;
import java.util.Scanner;

//class person / name tel 저장하는 멤버변수 // 생성자 초기화 //toString() 출력 
//ArrayList 사용 
class Person{
	String name, tel;
	public Person(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return name + ":" + tel ;
	}
}
public class Mid10 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("이름과 전화번호 입력: ");
			String name=s.next();
			String tel=s.next();
			list.add(new Person(name,tel)); //초기화
		}
			System.out.println("친구들 전화번호 목록");
			for(Person obj:list)
				System.out.println(obj);
			
		}

	}


