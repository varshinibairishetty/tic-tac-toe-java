package r22;
abstract class shape{
	abstract void draw() ;
		void display() {
			System.out.println("this is a shape ");
		}
							
}
class circle extends shape{
	void  draw() {
		System.out.println("drwaing a circle");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			circle c=new circle();
			c.draw();
			c.display();

	}

}
