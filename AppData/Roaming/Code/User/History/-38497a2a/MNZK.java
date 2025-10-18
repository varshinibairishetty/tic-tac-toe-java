class oops{
    
    public static void main(String[] args){


        /*int []rollno=new int[5];
        String[] name=new String[5];
        float[]marks=new float[5];*/

        //Student []student=new Student[5];
        Student varshini=new Student();
        Student varsh=new Student(20,"varsss",99);
        System.out.println(varshini.marks);
        System.out.println(varshini.rollno);
        System.out.println(varsh.name);
    }
}
class Student{
    int rollno;
     String name;
     float marks;
     Student(){
        this.rollno=19;
        this.name="varshiniii";
        this.marks=100.0f;
     }
     Student(int roll,String naam,float mark){
        this.rollno=roll;
        this.name=naam;
        this.marks=mark;
     }

}