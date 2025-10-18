package OOPs;
class Pen{
	String color;
	String type;
	public void write(){
		System.out.println("writing");
	}
	public void color() {
		System.out.println(this.color);
	}
	public void type() {
		System.out.println(this.type);
	}
	public void print() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
	Pen(String color,String type ){
		this.color=color;
		this.type=type;
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1=new Pen("green","glittergel");
		pen1.print();
 
	/*   Pen pen2=new Pen();
		pen2.color="black";
		pen2.type="glitter";
		pen2.color();
		pen2.type();  */
	}

}
