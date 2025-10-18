package OOPs;
class Student{
	String name;
	int age;
	
	
	public void print(String name,int age) {
		System.out.println(name+" "+age);
	}
}
class Clgstudent extends Student{
	String clgname;
	public void print(String name,int age) {
		System.out.println(name+" "+age+" "+clgname);
	}


}
public class methodoverriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clgstudent  s1=new Clgstudent();
		s1.name="varsh";
		s1.age=19;
		s1.clgname=	"cmr";
		s1.print(s1.name,s1.age); 
		

	}

}
