package midterm.study01;
//Book클래스 정의
//상태 : 책제목(title), 작가(author)
//동작 : 출력메소드 정의 : 어린왕자의 저자는 생택쥐페리
//생성자 : 1. 책제목과 저자를 초기화하는 생성자 정의 2. 책제목만 초기화하는 생성자 정의
//객체를 생성하여 어린왕자 출력 / 춘향전 작가미상으로 출력 
class Book{
	String title, author;
	public void print() {
		System.out.println(title+ "의 작가는"+ author);
	}
	public Book(String title) {
		this.title=title; //너가 춘향전을 입력했다면, title에 춘향전을 넣을거야
		this.author="작가미상";
	}
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}

public class Mid7 {

	public static void main(String[] args) {
		Book b1 = new Book("어린왕자", "생택쥐페리");
		Book b2 = new Book("춘향전");
		b1.print();
		b2.print();

	}

}
