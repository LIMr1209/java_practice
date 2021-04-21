package java001;

import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 

public class Test03 extends Applet {  
	public TextField in=new TextField(10);  
	public Button btn = new Button("求平方");
	public Label out=new Label("结果是："); 
	public void init() {   
		 setLayout(new FlowLayout());   
		 add(in);   
		 add(btn);   
		 add(out);   
		 btn.addActionListener(new ActionListener() {   
			 public void actionPerformed(ActionEvent e){     
				 String s=in.getText(); 
				 double d=Integer.parseInt(s);     
				 double sq=d*d;    
				 out.setText(d+"的平方是"+sq); 
			 }
		 });
	}
	public void paint(Graphics g) {   
		 g.drawString("Welcome to Java!!", 50, 60 );  
	} 
}
 
