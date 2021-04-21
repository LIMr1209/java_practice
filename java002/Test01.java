package java002;

import javax.swing.*;

public class Test01 {
	public static void main(String[] args) {
		int i, n;
		String cc;
		cc = JOptionPane.showInputDialog("请输入一个三位整数:");
		n = Integer.parseInt(cc);
		for (i = 100; i <= n; i++) {
			if (shuixian(i))
				System.out.println(i + "是水仙花!");
			else
				System.out.println(i + "不是水仙花!");
		}

	}

	static boolean shuixian(int x) {
		int i, j, k;
		i = (int) x / 100;
		j = (int) (x % 100) / 10;
		k = x % 10;
		System.out.print(i + "   " + j + "   " + k + "   ");
		if (i * i * i + j * j * j + k * k * k == x)
			return true;
		else
			return false;
	}
}
// 输入一个三位整数，判断是不是水仙花数