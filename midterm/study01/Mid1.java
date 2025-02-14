package midterm.study01;

import java.util.Scanner;

public class Mid1 {

	public static void main(String[] args) {
		//5개의 정수를 입력받아 배열에 저장하고, 최댓값을 출력 
		Scanner s = new Scanner(System.in);
		int [] list = new int[5];
		System.out.println("wirte 5 number");
		list[0]=s.nextInt();
		int max = list[0];
		for(int i=0;i<list.length;i++) {
			System.out.println((i+1)+"bun zzza jung so wirte");
			list[i]=s.nextInt();
			if (max<list[i])
				max=list[i];
			
		
		}
	System.out.println("the most big number is " + max);
		

	}

}
