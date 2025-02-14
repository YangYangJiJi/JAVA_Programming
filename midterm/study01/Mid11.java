package midterm.study01;
//클래스 은행계좌 / 설계 : account / 멤버변수 : regNum(계좌번호), name, balance(입금액)
class Account1{
	public int regNum;
	private String name;
	private int balance;
	//생성자로 초기화하는게 아니라
	//메소드로 할당하고 반환을 한다.
	public void setName(String name) {//setName에 name 할당//묵언약속set
		this.name=name;
	}
	public String getName() {//getName으로 할당했던 name 반환//묵언약속get
		return name;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
}
public class Mid11 {

	public static void main(String[] args) {
		Account1 obj= new Account1();
		obj.regNum=1111;
		obj.setName("오은성");
		obj.setBalance(2000);
		System.out.println(obj.getName()+"의 입금액은"+obj.getBalance());
		

	}

}
