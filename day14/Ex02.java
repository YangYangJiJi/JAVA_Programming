package com.day14;
import java.util.Vector;
//클래스에 객체를 인스턴스화 해서 추가
//접근제한자도 시험범위에 들어감 (Kbank할때 중간고사에서도 보긴함) 
//protected도 시험나옴. 각각이 어디까지 제한하는지 알기
class Point
{	private int x,y;
	public Point(int x, int y)
	{	this.x=x;
		this.y=y;
	}
	public String toString() //투스트링 오버라이딩
	{
		return "("+x+","+y+")";
	}
}
public class Ex02 {
	public static void main(String[] args) {
		//벡터 컬렉션을 이용하여 위에 정의된 클래스 포인트 값의 요소 추가하고 출력
		//인티저 대신에 포인트 클래스 와야함. 
		Vector<Point> v = new Vector<>(); //(박스치는 시험문제냄)
		//어레이리스트아닌 벡터쓰는 이유 : 요즘은 다 가져다가 쓰는 시대임. 이거 모르면 못가져다가 씀 
		v.add(new Point(10,10)); //객체를 인스턴스화해서 출력 (시험문제냄) 
		v.add(new Point(5,10));
		v.add(new Point(100,15));
		for(Point list : v)
			System.out.println(list); //투스트링쓴이유 : 뒤에다가 메소드 쓰기 싫어서. 투스트링썼기때문에 list만 써도 나옴 
		v.remove(1);
		System.out.println("\n=======삭제 후 출력===========");
		//for each문 안쓰고 size 출력
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i)); //이것도 시험문제냄 
	}
}
