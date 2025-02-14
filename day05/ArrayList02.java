package com.day05;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		//ArrayList 클래스를 이용해서 좋아하는 과일 저장하기 
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("grape");
		fruit.add("apple");
		fruit.add("bread");
		fruit.add("banana");
		//fruit는 배열이 아님. fruit는 객체이다. 그래서 method를 호출해야 한다. 그래서 0번째로 호출할 수 없음
		//get이라는 메쏘드로 0번째를 호출 할 수 있음
		//for each문으로 쉽게 가져올 수 있음 
		
		for(String list : fruit)
			System.out.print(list+" "); //쉬운방법. 이걸 선호함 
		
		/* 
		for(int i=0;i<fruit.size();i++) //이건 잘 안쓰지만 원리는 알아야 함 
		 
			//System.out.print(fruit.[i]); //(x)
			System.out.print(fruit.get(i)+ " "); //(ㅇ)
		//fruit.length 못쓴다. 배열이 아니기 때문에 배열과 관련된 메쏘드를 쓸 수 없음 
		//lenght는 배열의 크기를 가져오는 메쏘드
		//대신 fruit.size는 객체의 크기를 가져오는 거기 때문에 사용 가능 
		*/
		
	System.out.println("\n+++++++++++++++");
	System.out.println("I want to find this data =" + fruit.get(2)); //이렇게 찾고싶은 값을 찾을 수 있다. 
	fruit.remove(2); //remove는 요소가 와도 됨.
	System.out.println("\n+++++++++++++++");
	for(String list : fruit)
		System.out.print(list+" ");
	fruit.remove("banana"); // 데이터 값을 직접 써서 지우는 것도 가능함 
	System.out.println("\n+++++++++++++++");
	for(String list : fruit)
		System.out.print(list+" ");
	fruit.add(1,"mango");//추가는 보통 맨 끝에 되는데, 어레이리스트는 원하는 위치에 끼워넣기 가능함. 
	System.out.println("\n+++++++++++++++");
	for(String list : fruit)
		System.out.print(list+" ");
	fruit.set(1,  "kiwi"); //망고가 키위로 바뀜. 
	System.out.println("\n+++++++++++++++");
	for(String list : fruit)
		System.out.print(list+" ");
	}

}
