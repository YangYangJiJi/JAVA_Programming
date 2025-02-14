package com.day07;
//Television 클래스 //channel, volumn turnoff : 멤버변수(접근제한 명령)
//생성자 (모든값을 초기화)  //toString함수를 통해 출력 메소드
class Television{
	public int getChannel() {//generate getter, setter로 한번에 함수 생성함.
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public boolean isTurnoff() {
		return turnoff;
	}
	public void setTurnoff(boolean turnoff) {
		this.turnoff = turnoff;
	}
	private int channel;
	private int volumn;
	private boolean turnoff;
	public Television(){
		this.channel=11;
		this.volumn=10;
		this.turnoff=false;
	}
	public Television(int channel, int volumn, boolean turnoff){
		this.channel=channel;
		this.volumn=volumn;
		this.turnoff=turnoff;
	}
	@Override
	public String toString() {//generate override로 했음
		return "Television의 [채널=" + channel + ", 볼륨=" + volumn + ", 켜진상태=" + turnoff + "]";
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Television tv1=new Television(); //tv1.turnoff=true; private해놨으니까 실행안됨.
		tv1.setTurnoff(true);
		System.out.println(tv1);
		Television tv2=new Television(39, 15, true);
		System.out.println(tv2);
		tv2.setChannel(21);
		System.out.println(tv2);
	}
}
