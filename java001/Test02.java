package java001;
import javax.swing.*;

public class Test02 {
	//�����ļ�����a21.java�� import javax.swing.*; 
	 
	public static void main(String[] args) {         
		int i,n; String cc;                  
		cc=JOptionPane.showInputDialog("������һ������:");         
		n=Integer.parseInt(cc);         
		for(i=2;i<=n;i++)          
			if(zhishu(i))  
				System.out.println(i+"������!");          
			else  System.out.println(i+" �� �� �� ��!");     
		}          
	static boolean zhishu(int x){
		 int i=2; 
		 
	     while((i<=x/2)&&(x%i!=0)) i++;      
	     if(i > x/2 ) 
	    	 return true;      
	     else 
	    	 return false; 
	}
}
