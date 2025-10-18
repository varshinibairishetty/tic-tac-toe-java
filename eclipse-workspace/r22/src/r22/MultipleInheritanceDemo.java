package r22;
interface printable{
	void print();

}
interface showable {
	void show();

}
class MultipleInheritance implements printable,showable{
	public void print() {
		System.out.println("print");
	}
	public void show() {
		System.out.println("show");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj =new MultipleInheritance();
		obj.print();
		obj.show();

	}

}
