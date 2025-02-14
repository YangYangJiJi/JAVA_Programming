package midterm.study01;

import java.util.Scanner;

//class Movie //상태 : title, director
//동작 : 영화제목과 감독을 3번 각각 입력하고, 입력한 데이터들을 출력하는 메소드
class Movie{
	String title, director;
	public Movie(String title, String director) {//생성자 초기화
		this.title=title;
		this.director=director;
	}
	public String toString() { //오버라이딩 
		return title+"의감독은"+director;
	}
}

public class Mid9 {

	public static void main(String[] args) {
		Movie [] m = new Movie[3]; 
		//여기서 사용한 new는 객체생성이 아닌, 배열생성을 위한것이다.
		Scanner s=new Scanner(System.in);
		for(int i=0;i<m.length;i++) {
			System.out.println("영화제목과 감독입력: ");
			String title = s.next();
			String director = s.next();
			m[i]=new Movie(title, director); //객체생성에 사용된 new
		}
		for(Movie obj:m)
			System.out.println(obj);

	}

}
