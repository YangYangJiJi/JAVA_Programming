package midterm.study01;

public class Mid15 {

	public static void main(String[] args) {
		// 배열 tenArray에 1~10까지 저장한 뒤, 모든 원소의 값을 더하여 출력하는 프로그램
		//for each 사용
		int [] tenArray = new int [10];
		for(int a=0;a<tenArray.length;a++) {
			tenArray[a]=a+1;
		}
		int sum=0;
		for(int k:tenArray)//k를 사용해서 tenArray를 가져와라
			sum=sum+k;
		System.out.println("sum is " + sum);

	}

}
