package com.day04;

public class Do01 {

	public static void main(String[] args) {
		
		int i=1; //초기값
		do {
			System.out.print(i+ " ");
			i++;
		}while(i<=10); //while문에 원래는 세미콜론 붙이는 거 아님. 하지만 여기서는 유일하게 세미콜론을 붙여서 반복을 끝냄
		
		//만약 초기값 i=100 이어도 do가 먼저 실행되기 때문에 게시판에 아무글이 없어도 게시판 페이지가 존재하는게 가능하다는거
		
		
	}

}
