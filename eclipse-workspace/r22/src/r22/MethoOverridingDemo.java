package r22;

	class A1{
		void callme() {
			System.out.println("super class method");
		}
	}
	class B1 extends A1{
		void callme() {
			System.out.println("sub class method ");
		}
	}


public class MethoOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj=new B1() ;
			obj.callme();
		}

	}


