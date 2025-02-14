package com.day05;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Exception03 {

	public static void main(String[] args) {
		// 3개의 정수를 입력받아 입력받은 정수의 합을 출력
		//( 단, 정수가 아닌 값이 입력되면 정수만 입력가능합니다 ) 예외처리해주세요
		//잘못입력받으면 비워줘야함. S.next()를 이용할 수 있음 
		Scanner s = new Scanner(System.in);
		int n,sum = 0;
		System.out.println("write 3 number ");
		for (int i=1;i<=3;i++)
		{
			System.out.print(i+"bun zza number write");
			try {
				n=s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("you can only write jung su"); //너 잘못했어를 알려줌 
				s.next(); //잘못된거 비워줘야함 
				i--; //여기서 다시 반복문을 계속해야함. 이걸 제외하고 출력해야 하니까 continue사용
				continue; //여기서 continue의 느낌을 이해해야 함. 중요중요중요 
							//continue는 건너띠고, 제외하고 출력한다라는게 진짜 뜻이아님// 반복문을 계속 한다는 느낌으로 알기.
			}
			 sum=sum+n;
		}
System.out.println("sum of number is " + sum);
	}
}
