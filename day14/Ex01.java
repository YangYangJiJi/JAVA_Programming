package com.day14;//분명히 시험문제 냄
import java.util.Vector; //벡터, 해쉬맵전부 다 유틸에 있기에 임포트 시켜주기

//vector클래스로 정수형데이터를 추가하고 출력시킴  (어레이리스트와똑같음)
//추가할때 add() / 몇번째 요소에 이 값을 추가할 거다 -> add(요소번호, 값)
//가져올때 get(요소번호) / 지울때 remove(요소번호)
public class Ex01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(); //<> 안에 int 못옴. 클래스만올수있기에 인티저로 씀
		v.add(10);  v.add(5);
		v.add(11);  v.add(20); v.add(7); //추가할때 쓰는 명령어 add()
		//length는 속성이다. 메소드가 아니다. 각각의 요소의 길이만 확인할 수 있다. 
		//배열의 길이는 size() 로 길이를 확인할 수 있다.  
		//v.length()는 있긴 함. 어레이리스트 해쉬맵에는 있는데 벡터에는 없음. 
		//v.length(1) 의미 : 1번째 요소값의 길이 만을 나타냄 
		for(Integer list : v)
			System.out.print(list+" ");
		System.out.println("\n요소의 개수값="+v.size());
		System.out.println("요소의 용량="+v.capacity()); //얼마정도의 메모리를 차지하는지 나타냄
		//요소의 개수만큼 요소의 값들을 합을 구해 출력 (for each문 쓰지 말고) / Arraylist와 똑같다. 복권예제
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		v.add(1,100);
		//v.remove(1)//1번째 요소 제거
		for(Integer list : v)
			System.out.print(list+" ");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~");
		int sum=0; //합계를 구할 방
		for(int i=0;i<v.size();i++)
			sum=sum+v.get(i);
		//메소드 4개 (add, remove, get, set) 추가하는거 1점 시험문제 냄 잘 숙지하기 
		System.out.println("요소의 값은="+sum);
	}
}
