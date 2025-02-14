package midterm.study01;

import java.util.Scanner;

public class Mid2 {

	public static void main(String[] args) {
		//5개의 정수를 입력받아 배열에 저장하고, for each문으로 출력
		//5개 정수의 합과 평균을 출력 
		Scanner s= new Scanner(System.in);
		int [] num = new int [5];
		int sum=0;
		System.out.println("5개의 정수를 입력하세요");
		for(int i=0;i<num.length;i++) {
			System.out.println((i+1)+"번째 정수입력 :");
			num[i]=s.nextInt();
		}
		for(int list:num)
			sum=sum+list;
		System.out.println("5개의 수의 합계는 "+sum);
		System.out.println("5개의 수의 평균은 "+ sum/num.length);
		

	}

}
