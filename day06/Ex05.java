package com.day06;
//Book 클래스정의
//상태 : 책제목 (title 변수), 저자(author 변수)
//동작 : 출력메소드 정의 (어린왕자의 저자는 생택쥐페리)
//생성자 : 1. 책제목과 저자를 초기화하는 생성자 정의 
//      2. 책제목만 초기화하는 생성자 정의 
//객체를 생성하여 어린왕자출력 춘향전 작가 없음으로 출력
 
class Book
{
	String title, author;
	public void print(){//동작
		System.out.println(title+"의 작가는 "+author);
	}
	public Book(String title){
		this.title=title; //이름을 똑같이 줌. 앞에꺼가 춘향전이라하면 뒤에꺼인 title에다 춘향전을 초기화할거야. 
		this.author="작가미상"; //null 나오는거 방지 
	}
	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Book b1=new Book("어린왕자", "생택쥐페리");
		Book b2=new Book("춘향전"); 
		b1.print();
		b2.print();
	}
}
