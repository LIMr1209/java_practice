package java003;

import java.awt.*;
import java.awt.event.*;

public class Test05 implements ActionListener {
	Frame g;
	TextField a,b,c;
	Label d,e,f;
	Button add,exit;
	Test05(){
		g = new Frame();
		g.setLayout(new GridLayout(4,2));
		a = new TextField(10);
		b = new TextField(10);
		c = new TextField(20);
		d = new Label("�ı���1");
		e = new Label("�ı���2");
		f = new Label("�ı���3");
		add = new Button("�ӷ�");
		exit = new Button("�˳�");
		add.addActionListener(this);
		exit.addActionListener(this);
		g.add(d);
		g.add(a);
		g.add(e);
		g.add(b);
		g.add(f);
		g.add(c);
		g.add(add);
		g.add(exit);
		g.setSize(300,300);
		g.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==add){
			int x = Integer.parseInt(a.getText());
			int y = Integer.parseInt(b.getText());
			int m = x+y;
			c.setText(String.valueOf(m));
		}else {
			System.exit(0);
		}
	}
	public static void main(String [] args) {
		new Test05();
		
	}
}
