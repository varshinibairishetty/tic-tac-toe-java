class oops{
    
    public static void main(String[] args){


        int []rollno=new int[5];
        String[] name=new String[5];
        float[]marks=new float[5];

        //Student []student=new Student[5];
        Student varshini=new Student();

        System.out.println(varshini.marks);
    }
}
class Student{
    int rollno;
     String name;
     float marks;
     Student(){
        this.rollno=19;
        this.name="varshiniii";
        this.marks=100.0;
     }

}