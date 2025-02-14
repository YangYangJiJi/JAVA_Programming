package com.day07;
//클래스 은행계좌  //설계 : Account
//멤버변수 : regNum(계좌번호), name(이름), balance(입금액)
class Account{
	public int regNum; //원래 계좌번호, 전화번호 이런건 String인데 일단은 int로 줌
	private String name; //접근제한자를 통해 접근을 제한 
	private int balance; //double로 줘도 됨 
	//생성자 정의도 사실 공개해주는거임. 
	//생성자로 초기화하는게 아니라 메소드로 할당하고 반환을 하고싶다.
	//할당을 할땐 보통 set으로 이름설정한다
	public void setName(String name){ //반환형태가 없고, 스스로 할당할거임 void
		this.name=name;
	}
	public String getName(){
		return name; 
		//너가 할당한 name을 돌려줄게 //private로 막아놨으니까 이 과정을 해야함	
	}//돌려줄땐 묵언의 약속으로 get으로 표현
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getBalance(){	
		return balance;
	}
}
public class Ex04 {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.regNum=1111; 
		obj.setName("오은성");
		obj.setBalance(2000);
		System.out.println(obj.getName()+"의 입금액은"+obj.getBalance());
		//접근제한자 private로 접근을 제한했으니까 출력이 안됨.
		//private로 막아둬서 접근이 제한됨
	}
}
