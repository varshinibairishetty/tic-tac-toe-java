package OOPs;
class Student{
	String name;
	int age;
	
	public void print(String name) {
		System.out.println(name);
	}
	public void print(int age) {
		System.out.println(age);
	}
	public void print(String name,int age) {
		System.out.println(name+" "+age);
	}
}

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  s1=new Student();
		s1.name="varsh";
		s1.age=19;
		s1.print(s1.name,s1.age); 

	}

}
