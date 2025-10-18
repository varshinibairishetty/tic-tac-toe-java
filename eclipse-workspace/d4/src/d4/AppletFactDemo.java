package d4;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletFactDemo extends Frame implements ActionListener  {
	Button b1,b2;
	Label l1,l2;
	TextField tf1,tf2;
	public  AppletFactDemo (){
		setLayout(new FlowLayout());
		b1=new Button("COMPUTE");
		b1.addActionListener(this);
		b2=new Button("CLEAR");
		b2.addActionListener(this);
		l1=new Label("NUMBER");
		l2=new Label("RESULT");
		tf1=new TextField(20);
		tf2=new TextField(20);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				
			
			int a=Integer.parseInt(tf1.getText());
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact*=i;
			}
			tf2.setText(""+fact);
			}
			catch(Exception ex) {
				tf2.setText("Invalid");
			}
		}else {
			tf1.setText("");
			tf2.setText("");
		}
	}
	
	public static void main(String[] args) {
		new AppletFactDemo();
	}

}
