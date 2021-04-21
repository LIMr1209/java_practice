package java001;

import javax.swing.*;

public class Test01 {
	public static void main(String[] args) {
		int i, n;
		String cc;
		double ee = 1;
		cc = JOptionPane.showInputDialog("请输入一个二位整数:");
		n = Integer.parseInt(cc);
		for (i = 1; i <= n; i++)
			ee = ee + 1 / jiech(i);
		System.out.println("运算结果是:" + ee);
	}

	static double jiech(int x) {
		int i;
		double jie = 1;
		for (i = 1; i <= x; i++)
			jie *= i;
		return jie;
	}
}

// 输入一个二位整数 求1+1到n的阶乘倒数 求和
// 1+1/1+1/1*2+1/1*2*3+1/1*1*2*3*...*n