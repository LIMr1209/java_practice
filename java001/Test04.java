package java001;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		// ��ֵ
		for (int i = 0; i < a.length; i++) {
			System.out.println(" ������ " + a.length + " ������ , ��ǰ�� " + (i + 1)
					+ " �� :");
			a[i] = sc.nextInt();
		}
		// ��ӡ
		System.out.print("����ǰ���飺 \n");
		show(a);
		max(a);
		sum(a);
	}

	// ��ӡ����
	public static void show(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(" �� " + (i + 1) + " �������ǣ� " + b[i] + "\n");
		}

	}

	// �����
	public static void max(int b[]) {
		int max = 0;
		for (int i = 0; i < b.length; i++) {
			if (max < b[i])
				max = b[i];
		}
		System.out.println(" �����е�������ǣ� " + max);
	}

	// ���
	public static void sum(int b[]) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		System.out.println(" ������ܺ��ǣ� " + sum);
	}
}
