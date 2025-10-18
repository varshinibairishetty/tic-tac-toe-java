package r22;

public class package4 {
	public int a=10;
}
package p2;
import r22.*;
public class B extends package4{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package4 obj=new package4();
		System.out.println(obj.a);

	}

}
