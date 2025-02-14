package midterm.study01;
//Television 클래스 //channel, volumn, turnoff를 멤버변수로
//생성자 (모든값을 초기화) //toString함수를 통해 출력 메소드 
class Televi{
	private int channel, volumn;
	private boolean turnoff;
	public Televi(int channel, int volumn, boolean turnoff) {
		//this.channel=channel;
	}
	
	public void setChannel(int channel) {
		this.channel=channel;
	}
	public int getChannel() {
		return channel;
	}
	public void setVolumn(int volumn) {
		this.volumn=volumn;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setTurnoff(boolean turnoff) {
		this.turnoff=turnoff;
	}
	public boolean getTrunoff() {
		return turnoff;
	}
	public String toString() {
		return "tv채널:" + channel + "볼륨" + volumn + "켜진상태" + turnoff;
	}
	
}

public class Mid12 {

	public static void main(String[] args) {
		Televi t1 = new Televi(15, 15, true);
		t1.setTurnoff(true);
		System.out.println(t1);
		Televi t2 = new Televi(39, 15, true);
		
		

	}

}
