package java003;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test04 implements ActionListener {
	// �������
	Frame f;
	// ���������ı���
	TextField a, b, c;
	// ����������ǩ
	Label labelone, labeltwo, labelthree;
	Button add, exit;

	Test04() {// ���캯��
		f = new Frame();
		f.setLayout(new GridLayout(4, 2));// �����񲼾֣�һ�����У�ÿ��������
		a = new TextField(10);
		b = new TextField(10);
		c = new TextField(20);
		labelone = new Label(" �ı���һ ");
		labeltwo = new Label(" �ı���� ");
		labelthree = new Label(" �ı����� ");
		add = new Button(" �ӷ� ");
		exit = new Button(" �˳� ");
		add.addActionListener(this);// ʵ�����������
		exit.addActionListener(this);// ʵ�����������
		f.add(labelone);
		f.add(a);
		f.add(labeltwo);
		f.add(b);
		f.add(labelthree);
		f.add(c);
		f.add(add);// ����������
		f.add(exit);
		f.setSize(300, 300);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int x, y, z;
		if (e.getSource() == add) {
			x = Integer.parseInt(a.getText());
			y = Integer.parseInt(b.getText());
			z = x + y;
			c.setText(String.valueOf(z));// ���ı���һ�Ͷ�������ĺ���ʾ���ı�������
		} else if (e.getSource() == exit)
			System.exit(0);
	}

	public static void main(String[] args) {
		new Test04();
	}
}
