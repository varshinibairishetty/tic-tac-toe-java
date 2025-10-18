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
		class Circle extends Shape{
			public void area(int r) {
				System.out.println((3.14)*r*r);
				
			}
	}
public class heirarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle ();
		Circle  c1=new Circle();
		t1.area();
		t1.area(10,5);
		c1.area();
		c1.area(5);
	}

}
