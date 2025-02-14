package com.day05;
import java.util.ArrayList;
public class Arraylist01 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<> ();
		//<E>가 제네릭이다. 요소를 받아와서 요소와 관련된 일을 할 때 
		//arraylist 꺽쇠 안에는 클래스밖에 못온다. int 이런거 못온다. 
		//꺽쇠안에는 class밖에 못온다는게 제일제일제일 중요 
		//integer 라는 class는 int 와 관련된 class
		//add() : 추가하는 메쏘드 //get : 가져오는 메쏘드 
		num.add(1); //이걸 10번 쓸거면 배열을 쓰는 이유가 없음
		//1부터 10까지를 메쏘드 호출해서 저장하는 방법 // for 문 사용 
		for(int i=1;i<=10;i++)
			num.add(i);
		for(int list:num)
			System.out.print(list);
		System.out.println("\n"+num.get(0)); //0번째 항목을 가져오겠다. 
	}
}
