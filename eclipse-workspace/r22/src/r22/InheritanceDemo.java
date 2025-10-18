package r22;
 
class A{
	int i,j;
	void showij() {
		System.out.println(i+" "+j);
	}
}
class B extends A{
	int k;
	void showk() {
		System.out.println(k);
	}
	void sum() {
		System.out.println(i+j+k);
	}
}
class C extends A{
	void show() {
		System.out.println("class c");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		obj1.i=10;
		obj1.j=20;
		obj1.showij();
		obj2.i=25;
		obj2.j=10;
		obj2.k=35;
		obj2.showk();
		obj2.sum();
		obj3.show();

	}

}
