package com.day13;
//phone 인터페이스 : sendcall() receivecall() 전화를 주고받음 
//-- 상수값 변수 (final) 정의 / 디폴트메소드 정의
//--패키지는 폴더의 개념. 하지만 실무에서는 절대 디폴트로 안줌. public으로 준다. 
//smart 인터페이스 : phone 인터페이스를 상속받음 -> 인터가 인터 상속 : extends로 상속받아야함 (implements 안됨)sendSns() receiveSns()
// Mp3 인터페이스 : 음악재생 play() 메소드 / stop()    //Pda 클래스 : Calculator ()
// 하나에 만드는게 아니라 나눠서 만드는 이유 : mp3기능은 mp3 기능 뿐만 아니라 다른 곳에도 쓰일 수 있음. 합쳐놓은게 스마트폰
//smartPhone 클래스 정의해서 위에있는 모든 기능 상속받아 구현
interface Phoneinterface
{
	final int TIMEOUT = 10000; //상숫값 멤버변수 정의 (final)
	public void sendCall();
	public void receiveCall();
	default void printLogo() //디폴트 메소드만 가능
	{
		System.out.println("***********phone***********");
	}
}
interface Smartinterface extends Phoneinterface 
//인터페이스가 인터페이스 상속받을 때 extends 사용 (ox문제, 괄호채우기 기말문제 낼거임) 중요중요
{
	public void sendSns();
	public void receiveSns();
}

interface Mp3
{
	public void play();
	public void stop();
}

class Pda
{
	public int calculator(int a, int b)
	{
		return a+b;
	}
}

class SmartPhone extends Pda implements Smartinterface, Mp3
//이거 만들자마자 에러나는 이유 : 오버라이딩을 아직 안해줘서 
{

	@Override
	public void sendCall() {
		System.out.println("전화거는중");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받고있습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악재생");
	}

	@Override
	public void stop() {
		System.out.println("음악멈춤");
	}

	@Override
	public void sendSns() {
		System.out.println("문자보내는중");
	}

	@Override
	public void receiveSns() {
		System.out.println("문자왔음");
	}
	
	public void scheduleing() { //추가적으로 넣어줌
		System.out.println("일정관리");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sm= new SmartPhone();
		sm.printLogo();
		sm.receiveSns();
		sm.scheduleing();
	}

}
