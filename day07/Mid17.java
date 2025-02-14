package com.day07;

public class Mid17 {

	public static void main(String[] args) {
		int[]num=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			num[i]=i+1;
			System.out.println(num[i]);
		}
		for(int n : num)
			sum=sum+n;
		System.out.println("number in list is "+sum);
		
		String [] s= {"ap"+"bana"+"grap"+"mango"};
		for (String fruit : s)
			System.out.println(fruit);

	}

}
