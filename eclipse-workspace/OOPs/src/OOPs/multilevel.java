package OOPs;

class Shape{
	public void area() {
		System.out.println("display area");
	}
}
	class Triangle extends Shape{
		public void area(int l,int h) {
			System.out.println(1/2*l*h);
			
		}
	}
		class EquilateralTriangle extends Triangle{
			public void area(int l,int h) {
				System.out.println(1/2*l*h);
				
			}
	}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilateralTriangle e1=new EquilateralTriangle();
		e1.area();
		e1.area(10,5);
		

	}

}
