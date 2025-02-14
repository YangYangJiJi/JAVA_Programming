package com.day14;
import java.util.HashMap;
import java.util.Scanner;
//Student 클래스 정의   //학생들의 id와 tel 멤버변수 접근제한하기 
//생성자도 초기화하기  //set 함수 주지 말고, getter함수로 정의값을 반환하는 메서드 정의
class Student {
	private int id;
	private String tel;
	public Student (int id, String tel) {
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}
public class Ex05 {
	public static void main(String[] args) {
		//3명의 학생의 정보를 Hashmap 컬렉션을 이용하여 이름과 student클래스의 값(아이디, 전번)을 추가
		//앞에는 홍길동 저장, 뒤에는 아이디,전번을 스튜던트 클래스를 인스턴스화 해서 추가
		//홍길동 검색하면 홍길동의 아이디, 전번 추가
		HashMap<String, Student> map= new HashMap<String, Student>();
		//얘는 요소값이 2개니까 뒤에도 꼭 <String, Student> 넣어주기
		
		//3명의 이름과 학생의 정보 추가
		map.put("홍길동", new Student(1,"010-1111-2222"));
		map.put("김영희", new Student(2,"010-3333-2222"));
		map.put("김수철", new Student(3,"010-5555-7777"));
		Scanner s = new Scanner(System.in);
		
		//찾고싶은 사람의 이름을 입력받아서 그 이름의 번호와 전번이 나오게하가ㅣ
		//단, exit를 입력받으면 종료. 검색할 이름이 존재하지 않으면 "검색할 값이 없습니다." 출력
		while(true)
		{
			System.out.println("찾는사람 입력:");
			String name = s.next();
			if(name.equals("exit"))
				break;
			//이름의 값을 get() 메서드로 찾기
			Student stu = map.get(name); 
			//필기로 보면 정말 힘들다. Student가 맨앞에 나온다는걸 꼭 기억하기. 뭔가 시험삘
			if(stu==null)
				System.out.println("찾는사람이 없습니다.");
			else
				System.out.println(stu.getId()+":"+stu.getTel());
			//접근제한되었기에 getter로 가져옴
		}
	}
}
