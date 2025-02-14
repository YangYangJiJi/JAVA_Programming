package finalterm.study01;
import java.util.Scanner;

class Menu {
	FriendInfoController controller; //변수

	Menu(){ 
		controller = new FriendInfoController();
	}
	
	public void displayMenu() {
		
		while(true) {
			System.out.println("*****  메뉴 선택  *****");
			System.out.println("0. 프로그램 종료.");
			System.out.println("1. 고교 친구 정보 저장.");
			System.out.println("2. 대학교 친구 정보 저장.");
			System.out.println("3. 고교 친구 정보 출력.");
			System.out.println("4. 대학교 친구 정보 출력.");
			
			System.out.print("원하는 항목 번호를 선택하세요>> ");
			
			Scanner input = new Scanner(System.in);
			
			int choice = input.nextInt();
			
			switch(choice) {
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				case 1: case 2: // 고/대학교 친구 정보 저장.
					controller.addFriend(choice);
					break;
				case 3: // 고교 친구 정보 출력
					controller.displayHighFriendInfo();
					break;
				case 4: // 대학교 친구 정보 출력
					controller.displayUnivFriendInfo();
					break;
				default:
					System.out.println("잘못된 입력을 하셨습니다.");
					System.out.println("번호를 확인하세요.");
					break;
			}
		}
	}
}

//menu -> 데이터 입력 -> 저장
class FriendInfoController { //나는 setting
	private HighFriend1[] highFriend1;
	private UnivFriend1[] univFriend1;
	private int indexOfHigh;
	private int indexOfUniv;
	final private int MAX_HIGH;
	final private int MAX_UNIV;

	FriendInfoController(){
		MAX_HIGH = 100;
		indexOfHigh = 0;
		highFriend1 = new HighFriend1[MAX_HIGH];
		
		MAX_UNIV = 100;
		indexOfUniv = 0;
		univFriend1 = new UnivFriend1[MAX_UNIV];
	}
	
	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String work, major;
		
		System.out.print("이름을 입력하세요 : ");
		String name = input.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String phone = input.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = input.nextLine();
		
		if(choice == 1) {
			System.out.print("직업을 입력하세요 : ");
			work = input.nextLine();
			
			highFriend1[indexOfHigh++] = new HighFriend1(name, phone, address, work);
			//indexOfHigh++;
			
		}else if(choice == 2){
			System.out.print("전공을 입력하세요 : ");
			major = input.nextLine();
			
			univFriend1[indexOfUniv++] = new UnivFriend1(name, phone, address, major);
			//indexOfUniv++;
		}
		
	}
	
	public void displayHighFriendInfo() { // 3번 기능
		for(int i = 0; i < indexOfHigh; i++) {
			highFriend1[i].displayHighFriendInfo();
			System.out.println();
		}
	}
	
	public void displayUnivFriendInfo() { // 4번 기능
		for(int i = 0; i < indexOfUniv; i++) {
			univFriend1[i].displayUnivFriendInfo();
			System.out.println();
		}
	}
}

class Friend2 {
	// field
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	// Constructor
	Friend2(String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// Method
	public void displayFriendInfo() {
		System.out.println("이름 : "+name);
		System.out.println("폰번호 : "+phoneNum);
		System.out.println("주소 : "+address);
	}
}

class HighFriend1 extends Friend2{ // 고등학교 친구
	private String work; // 직업
	
	HighFriend1(String name, String phoneNum, String address, String work){
		super(name, phoneNum, address);
		this.work = work;
	}
	
	public void displayHighFriendInfo() {
		displayFriendInfo();
		System.out.println("직업 : "+work);
	}
}

class UnivFriend1 extends Friend2{
	private String major; // 전공
	
	UnivFriend1(String name, String phoneNum, String address, String major){
		super(name, phoneNum, address);
		this.major = major;
	}
	
	public void displayUnivFriendInfo() {
		displayFriendInfo();
		System.out.println("전공 : "+major);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu(); 

		 menu.displayMenu(); 

	}

}
