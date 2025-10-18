package r22;
class Encapsulation{
	int a=10;
	int b=3;
	int z;
	void add() {
		z=a+b;
		System.out.println(z);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation();
		obj.add();

	}

}
