package report.task;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Friend{
	protected String name, phone, home;
	abstract public void BasicData();
}

class FriendMenu{ 
	public void showMenu() {
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
					HighFriend highfriend = new HighFriend();
					highfriend.BasicData();
					break;
					
				case 2://대학교 친구 저장
					UnivFriend univfriend = new UnivFriend();
					univfriend.BasicData();
					break;
					
				case 3: //전체 정보 출력
					AllData alldata = new AllData();
					System.out.println(alldata);
					break;
					
				case 4: //기본 정보 출력
					break;
					
				case 5: //프로그램 종료
					System.out.println("친구 주소록 프로그램 종료");
					return;
				default:
					System.out.println("정확한 번호를 입력하세요");
					break;
			}
		}
	}
}

class HighFriend extends Friend {
	protected String job;
	public HighFriend(String name, String phone, String home, String job) {
		super.name=name;
		super.phone=phone;
		super.home=home;
		this.job=job;
	}
	
	public HighFriend() {
		// TODO Auto-generated constructor stub
	}

	ArrayList <HighFriend> list=new ArrayList <>();
	Scanner s = new Scanner(System.in);
		@Override
		public void BasicData() {
			System.out.print("이름 : ");
			String name = s.next();
			System.out.print("전화 : ");
			String phone = s.next();
			System.out.print("주소 : ");
			String home = s.next();
			System.out.print("직업 : ");
			String job = s.next();
			list.add(new HighFriend(name, phone, home, job));
		}
	public String HighAllData() {
		for(HighFriend obj : list)
			System.out.println(obj);
		return "이름 : " + name +
				"\n전화 : " + phone +
				"\n주소 : " + home +
				"\n직업 : " + job;
	}
}


class UnivFriend extends Friend {
	protected String major;
	public UnivFriend(String name, String phone, String home, String major) {
		super.name=name;
		super.phone=phone;
		super.home=home;
		this.major=major;
	}
	public UnivFriend() {
		// TODO Auto-generated constructor stub
	}
	ArrayList <UnivFriend> list=new ArrayList <>();
	Scanner s = new Scanner(System.in);
		@Override
		public void BasicData() {
			System.out.print("이름 : ");
			String name = s.next();
			System.out.print("전화 : ");
			String phone = s.next();
			System.out.print("주소 : ");
			String home = s.next();
			System.out.print("전공 : ");
			String major = s.next();
			list.add(new UnivFriend(name, phone, home, major));
		}
	public String UnivAllData() {
		for(UnivFriend obj : list)
			System.out.println(obj);
		return "이름 : " + name +
				"\n전화 : " + phone +
				"\n주소 : " + home +
				"\n전공 : " + major;
	}
}

class AllData {
	public AllData(){
		HighFriend highalldata = new HighFriend();
		System.out.println(highalldata.HighAllData());
		System.out.println("\n");
		UnivFriend univalldata = new UnivFriend();
		System.out.println(univalldata.UnivAllData());
	}
}


public class Report2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendMenu menu = new FriendMenu();
		menu.showMenu();

	}

}
