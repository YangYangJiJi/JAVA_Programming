package com.day14;
import java.util.HashMap;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		//영어문자를 통해 한국어로 검색하는 프로그램을 Hashmap이라는 collection을 이용해서 검색해보기
	HashMap<String, String> dic = new HashMap<String, String>();//꼭 자동완성해야 임포트 안할 수 있음
	//해쉬맵은 꼭 앞뒤로 타입 넣어주기  아니면 컴터가 헷갈려함
	dic.put("baby", "아기"); 
	dic.put("love", "사랑");
	dic.put("apple", "사과");
	dic.put("hello", "안녕");
	//영어단어를 입력받아 그 단어의 한국어를 출력
	//exit 입력받으면 종료
	//검색할 단어가 없으면 '검색할단어가 없음' 출력
	Scanner s= new Scanner(System.in);
	while(true)
	{
		System.out.println("찾고 싶은 단어 입력: ");
		String eng = s.next();
		//묻고따지기 전에 exit 먼저 해야함. 제일 먼저 빠져나가는게 들어가기
		if(eng.equals("exit"))
		{
			System.out.println("검색을 종료합니다.");
			break;
		}
		String kor = dic.get(eng);//여기가 제일 중요 중요 중요 / 찾는값 찾기 / 우리의 키 값 K(영문자)은 eng에 있음
		if(kor==null)
			System.out.println(eng+"단어는 없는 단어입니다.");
		else
			System.out.println(kor);
	} //hasmap 사용한 방법/ 추가방법 / 가져오는 방법 이 여기서 배울 점 
	} //get : 왼쪽에 있는 키 값을 이용해서 단어를 가져올 때 쓰는 함수
}


