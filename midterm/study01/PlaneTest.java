package midterm.study01; //첫번째 과제 

class Plane{
	private String model;
	private int maxperson;
	private String company;
	private static int planes = 0;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxperson() {
		return maxperson;
	}

	public void setMaxperson(int maxperson) {
		this.maxperson = maxperson;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public static int getPlanes() {
		return planes;
	}

	public static void setPlanes(int planes) {
		Plane.planes = planes;
	}
	
	public Plane () {
		this.model="A380";
		this.maxperson=500;
		this.company="airbus";
		planes++;
	}
	
	public Plane (String model, int maxperson, String company){
			this.model=model;
			this.maxperson=maxperson;
			this.company=company;
			planes++;
	}
	
	public static int getCount(){
		return planes;
	}
	
	@Override
	public String toString() {
		return "비행기 모델 : " + model + ", 승객수 : " + maxperson + "명, 제조사 : " + company;
	}
	
}

public class PlaneTest {

	public static void main(String[] args) {
		Plane pn1 = new Plane("Boeing737", 800, "Asiana");
		Plane pn2 = new Plane("Boeing800", 900, "korea");
		Plane pn3 = new Plane();
		
		System.out.println("비행기 개수 : " + Plane.getCount() + " 개");
		System.out.println(pn1);
		System.out.println(pn2);
		System.out.println(pn3);
		
	}

}
