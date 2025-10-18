package r22;
class Callme{
	void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted ");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	public Caller (Callme targ,String s) {
		target=targ;
	msg=s;
	t=new Thread(this,"demo");
	t.start();
	
}
	public void run() {
		synchronized (target){
			target.call(msg);
		}
	}
}


public class SyncronizationDemo {

	
		// TODO Auto-generated method stub
		public static void main(String args[])
	    { 
			Callme target=new Callme();
			Caller obj2=new Caller(target,"hello");
			Caller obj3=new Caller(target,"world");		
	    
	              
	}
}
	

	