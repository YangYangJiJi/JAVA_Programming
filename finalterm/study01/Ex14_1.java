package finalterm.study01;

import java.util.Vector;

public class Ex14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>v= new Vector<>();
		v.add(10); v.add(10); v.add(10); v.add(10); v.add(10);
		for(Integer list : v)
			System.out.println(list+" ");
		System.out.println("요소의 개수값="+v.size());
		System.out.println("요소의 용량="+v.capacity());
		System.out.println("+++++++++++++++++++++++");
		v.add(1, 100);
		for(Integer list : v)
			System.out.print(list+" ");
		System.out.println("+++++++++++++++++++++++");
		int sum=0;
		for(int i=0;i<v.size();i++)
			sum=sum+v.get(i);
		System.out.println("요소의 값은"+sum);

	}

}
