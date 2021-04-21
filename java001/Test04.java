package java001;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		// 赋值
		for (int i = 0; i < a.length; i++) {
			System.out.println(" 请输入 " + a.length + " 个数字 , 当前第 " + (i + 1)
					+ " 个 :");
			a[i] = sc.nextInt();
		}
		// 打印
		System.out.print("排序前数组： \n");
		show(a);
		max(a);
		sum(a);
	}

	// 打印函数
	public static void show(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(" 第 " + (i + 1) + " 个数字是： " + b[i] + "\n");
		}

	}

	// 最大数
	public static void max(int b[]) {
		int max = 0;
		for (int i = 0; i < b.length; i++) {
			if (max < b[i])
				max = b[i];
		}
		System.out.println(" 数据中的最大数是： " + max);
	}

	// 求和
	public static void sum(int b[]) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		System.out.println(" 数组的总和是： " + sum);
	}
}
