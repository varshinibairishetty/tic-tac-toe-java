package OOPs;
 class Pen{
	String color;
	String type;
	
	public void print() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
	 Pen(Pen p2 ){
		this.color=p2.color;
		this.type=p2.type;
	}
	  Pen(){
		
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1=new Pen();
		pen1.color="red";
		pen1.type="shine";
												
		Pen pen2=new Pen(pen1);
		pen2.print();
		

	}

}
