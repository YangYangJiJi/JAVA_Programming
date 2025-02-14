package midterm.study01;

public class Self0416 {

	public static void main(String[] args) {
		//배열 tenArray에 1~10까지 저장한 뒤, 모든 원소의 값을 더하여 출력하는 프로그램을 작성
		int [] tenArray = new int[10];
		
		for(int i=0;i<tenArray.length;i++)
			tenArray[i]=i+1;
		
		/*int sum=0;
		for (int i=0;i<tenArray.length;i++)
			sum=sum+tenArray[i];
		System.out.print(sum);*/
		
		int sum=0;
		for(int k:tenArray)
			sum=sum+k;
		System.out.println("합계는"+sum);
	}
}
