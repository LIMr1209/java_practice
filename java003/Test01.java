package java003;

import javax.swing.JOptionPane;


public class Test01 {     
	public static void main(String[] args) {         
		int i,n; String cc;                  
		cc=JOptionPane.showInputDialog("请输入一个整数:");         
		n=Integer.parseInt(cc);         
		for(i=2;i<=n;i++)                 
			if(zhishu(i)) 
				System.out.println(i+"是质数!");                 
			else 
				System.out.println(i+"不是质数!");     
		}          
	static boolean zhishu(int x){      
		int i=2;      
		while((i<=x/2)&&(x%i!=0)) 
			i++;      
		if(i>x/2) 
			return true;      
		else 
			return false;     
		} 
	} 
//求质数