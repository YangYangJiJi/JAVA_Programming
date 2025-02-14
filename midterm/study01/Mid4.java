package midterm.study01;

import java.util.ArrayList;
import java.util.Scanner;

public class Mid4 {

	public static void main(String[] args) {
		//좋아하는 운동종류를 저장하는 ArrayList클래스를 이용해 입력받아 4개 항목을 추가하기
		//for each문을 활용 //arraylist : 배열의 크기가 자동으로 변경되는 배열. 
		Scanner s=new Scanner(System.in);
		ArrayList<String> sports= new ArrayList<>();
		System.out.println("write 4 sports that you like");
		for(int i=0;i<4;i++) {
			System.out.println("write");
			sports.add(s.next());
		}
		System.out.println("my favorite sports are");
		for(String Sp : sports)
			System.out.println(Sp+" ");
		System.out.println("most faovrite"+sports.get(0));
	}

}
