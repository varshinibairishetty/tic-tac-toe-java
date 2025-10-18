package d4;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Calculator");
        JTextField tf1 = new JTextField(); tf1.setBounds(50, 40, 150, 20);
        JTextField tf2 = new JTextField(); tf2.setBounds(50, 70, 150, 20);
        JTextField tf3 = new JTextField(); tf3.setBounds(50, 100, 150, 20); tf3.setEditable(false);
        
        JButton add = new JButton("+"); add.setBounds(50, 140, 50, 30);
        JButton sub = new JButton("-"); sub.setBounds(110, 140, 50, 30);
        JButton mul = new JButton("*"); mul.setBounds(50, 180, 50, 30);
        JButton div = new JButton("/"); div.setBounds(110, 180, 50, 30);

        add.addActionListener(e -> tf3.setText("" + (Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText()))));
        sub.addActionListener(e -> tf3.setText("" + (Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText()))));
        mul.addActionListener(e -> tf3.setText("" + (Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText()))));
        div.addActionListener(e -> tf3.setText("" + (Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText()))));

        f.add(tf1); f.add(tf2); f.add(tf3);
        f.add(add); f.add(sub); f.add(mul); f.add(div);
        f.setSize(250, 300); f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

	