package java001;

import javax.swing.*;

public class Test01 {
	public static void main(String[] args) {
		int i, n;
		String cc;
		double ee = 1;
		cc = JOptionPane.showInputDialog("������һ����λ����:");
		n = Integer.parseInt(cc);
		for (i = 1; i <= n; i++)
			ee = ee + 1 / jiech(i);
		System.out.println("��������:" + ee);
	}

	static double jiech(int x) {
		int i;
		double jie = 1;
		for (i = 1; i <= x; i++)
			jie *= i;
		return jie;
	}
}

// ����һ����λ���� ��1+1��n�Ľ׳˵��� ���
// 1+1/1+1/1*2+1/1*2*3+1/1*1*2*3*...*n