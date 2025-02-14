/*package report.task;

import java.util.Scanner;

class FriendMenu {
	public 
	
	public void Menu(){ 
		link = new FriendInfoController();
	}
	
	public void Menu() {
		while(true) {
			System.out.println("***메뉴 선택***");
			System.out.println("1. 고교 정보 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택>> ");
			
			Scanner s = new Scanner(System.in);
			int MenuNum = s.nextInt();
			
			switch(MenuNum) {
				case 1://고등학교 친구 저장
					link.SaveHigh1();
					break;
				case 2://대학교 친구 저장
					link.SaveUniv1();
					break;
				case 3: //전체 정보 출력
					link.전체정보출력();
					break;
				case 4: //기본 정보 출력
					link.기본정보출력();
					break;
				case 5:
					System.out.println("친구 주소록 프로그램 종료");
					return;
					break;
				default:
					System.out.println("정확한 번호를 입력하세요");
					break;
			}
		}
	}
}

abstract class Friend1{
	protected String name, phone, home;
	public abstract void BasicDataShow(); //기본정보보기
	public Friend1 (String name, String phone, String home) {
		this.name=name;
		this.phone=phone;
		this.home=home;
	}
}

class HighFriend1 extends Friend1{ //1. 고교 정보 저장
	private String job;
	public HighFriend1 (String name, String phone, String home, String job) {
		super(name, phone, home);
		this.job=job;
	}
	@Override
	public void BasicDataShow() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + home);
		System.out.println("직업 : " + job);
	}
}

class UnivFriend1 extends Friend1{ //2. 대학 친구 저장
	private String major;
	public UnivFriend1 (String name, String phone, String home, String mojor) {
		super(name, phone, home);
		this.major=major;
	}
	@Override
	public void BasicDataShow() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + home);
		System.out.println("전공 : " + major);
	}
}

class SaveHigh extends HighFriend1 {
	public SaveHigh (String name, String phone, String home, String job) {
		super(name, phone, home, job);
	}
}

public class Report1 {

	public static void main(String[] args) {
		ArrayList<SaveHigh> list= new ArrayList<>();
		Scanner s= new Scanner(System.in);
		for(int i=0;i<2;i++) { //일단 3으로 함
			System.out.println("이름 : ");
			String name=s.next();
			System.out.println("전화 : ");
			String phone=s.next();
			System.out.println("주소 : ");
			String home=s.next();
			System.out.println("전공 : ");
			String job=s.next();
			list.add(new SaveHigh(name, phone, home, job));		
		}
	}
}*/
