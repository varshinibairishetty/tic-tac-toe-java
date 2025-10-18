package r22;

public class package5 {
	public int a=10;
}
package r23;
import r22.*;
public class B{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package5 obj=new package5();
		System.out.println(obj.a);

	}

}
