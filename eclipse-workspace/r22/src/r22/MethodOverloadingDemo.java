package r22;
 
class methodoverloading{
	void test() {
	 System.out.println("no parameters");
	}
	void test(int a) {
		System.out.println(a);
	}
	void test(int a,int b) {
		System.out.println(a+" "+b);
	}
	void test(double a) {
		System.out.println(a);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading obj=new methodoverloading();
		obj.test();
		obj.test(10);
		obj.test(10,20);
		obj.test(10.4);

	}

}
