package java002;

import javax.swing.*;

public class Test02 {
	public static void main(String args[]) {
		String cc;
		int x;
		cc = JOptionPane.showInputDialog("������һ��������");
		x = Integer.parseInt(cc);
		if ((x % 4 == 0 && x % 100 != 0) || x % 100 == 0)
			System.out.println(x + "������ �꣡");
		else
			System.out.println(x + "�겻���� �꣡");
	}
}