package finalterm.study01;

import java.util.HashMap;
import java.util.Scanner;

public class Ex14_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic= new HashMap<String, String>();
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		Scanner s= new Scanner(System.in);
		while(true) {
			System.out.println("찾고싶은 단어입력");
			String eng=s.next();
			if(eng.equals("exit"))
			{
				System.out.println("종료");
				break;
			}
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println("you're wrong");
			else
				System.out.println(kor);
		}
		

	}

}
