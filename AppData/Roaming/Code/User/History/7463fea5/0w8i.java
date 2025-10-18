class Pen{
    String colour;
    String type;
    Public void printcolour{
        System.out.println(this.colour);
    }
}
Public class OOPS{
    public static void main(System.in){
        Pen pen1=new Pen();
        pen1.colour="blue";
        pen1.type="flair";

        Pen pen2=new Pen();
        pen1.colour="black";
        pen2.type="doms";

        pen1.printcolour();
        pen2.printcolour();
    } 
}