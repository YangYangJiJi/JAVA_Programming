package com.day13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Jpanel 클래스로 판깔기   //Jbutton 크래스 선언하고 추가하기
//버튼 클릭시 버튼의 색깔로 panel 의 배경색 변하는 이벤트 적용 

class Event01 extends JFrame implements ActionListener
//컨트롤 스페이스로 자동완성 
//윈도우 창에 뜨는 것 J프레임에 있음 (화면설계)
//액션리스너는 인터페이스 (
{
	private JButton b1, b2; //j버튼으로 버튼 2개 만들거라는 선언만 함 
	private JPanel panel;
	public Event01() //디폴트 생성자로 프레임의 크기, 모양, 배치를 초기화시킴 
	{
		setSize(300,200); //앞에 this 생략함. this.setSize 해야했음 원래는  / 프레임의 가로, 세로버튼 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //열고닫는 버튼 
		panel= new JPanel(); //이제 panel이 객체화 된거임. 객체화 시키는 명령어는 new //클래스는 일을 못하고 얘까 일을함 
		b1=new JButton("노란색");
		b2=new JButton("초록색");
		setVisible(true); //위에걸 보이게 함. 기본값이 false라 위에거 쳐도 안보임 //visible은 맨 마지막에 넣어줘야함
		panel.add(b1); //판떼기에 버튼 하나를 깔음 
		panel.add(b2); //판떼기에 다음 버튼을 깔음
		b1.addActionListener(this);
		b2.addActionListener(this);//이 this는 액션이벤트 e를 받아옴 
		add(panel); //앞에 this. 생략되어있음 
	}
	@Override
public void actionPerformed(ActionEvent e) {
	//받아올 때 쓰는 메소드 는 get / 줄때는 set 
		if(e.getSource()==b1)
			panel.setBackground(Color.yellow); //color 도 클래스임. 임포트 시켜야 함 
		if(e.getSource()==b2)
			panel.setBackground(Color.green);  //이거랑 밑에거 둘다 가능 
		/*else
			panel.setBackground(Color.green);*/
}
}
	
public class Ex02 {

	public static void main(String[] args) {
		Event01 obj = new Event01();
	}
}
