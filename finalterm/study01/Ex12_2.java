package finalterm.study01;
interface Calcutor{
	abstract public int add(int a, int b);
	abstract public int substract (int a, int b);
	abstract public double average (int[] a);
}

public class Ex12_2 implements Calcutor{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for (int i=0;i<a.length;i++)
			sum=sum+a[i];
		return (double)sum/a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12_2 obj=new Ex12_2();
		System.out.println(obj.add(10, 5));
		System.out.println(obj.substract(10, 5));
		System.out.println(obj.average(new int[] {10, 20, 30, 40}));

	}

}
