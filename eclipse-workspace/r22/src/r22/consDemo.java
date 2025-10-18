package r22;
class Box1{
	Box1(){
		System.out.println("default constructor");
	}
	Box1(int i,int j){
		System.out.println(i+j);
	}
	Box1(int i,int j,int z){
		System.out.println(i+j+z);
	}
}
public class consDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 obj1=new Box1();
		Box1 obj2=new Box1(1,1);
		Box1 obj3=new Box1(1,1,1);

	}

}
