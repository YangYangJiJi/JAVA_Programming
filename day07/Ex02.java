package com.day07;
import java.util.Scanner;

class Movie{
	String title, director ;
	public Movie (String title, String director){
		this.title=title;
		this.director=director;
	}
	public String toString(){ //너가 자바에 원래 있는 to String을 다시 정의하는구나
		return title+"의 감독은" +director;
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Movie [] m = new Movie[3]; 
		Scanner s = new Scanner(System.in);
		//진짜로 객체가 만들어 진게 아님. 배열을 선언하고 배열을 생성한거이다.
		//클래스는 모형이다. 틀이다. 진짜일을 하는건 객체이다. //객체는 new를 통해 만드는 거다
		//but 여기서는 new를 사용해서 배열을 선언하고, 정의한것 뿐이다. 
		for(int i=0;i<m.length;i++){
			System.out.println("영화제목과 감독 입력 : ");
			String title = s.next();
			//여기서 title은 지역변수라 이 for문에서만 유효함
			String director = s.next();
			m[i]= new Movie(title,director);//객체를 생성하는 과정이다.
		}
		for(Movie obj:m)
			System.out.println(obj);
		//toString할 필요 없음. 원래 쓰는 애라서 생략가능
	}
}
