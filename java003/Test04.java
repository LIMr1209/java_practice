package java003;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test04 implements ActionListener {
	// 创建框架
	Frame f;
	// 创建三个文本框
	TextField a, b, c;
	// 创建三个标签
	Label labelone, labeltwo, labelthree;
	Button add, exit;

	Test04() {// 构造函数
		f = new Frame();
		f.setLayout(new GridLayout(4, 2));// 用网格布局，一共四行，每行有两列
		a = new TextField(10);
		b = new TextField(10);
		c = new TextField(20);
		labelone = new Label(" 文本框一 ");
		labeltwo = new Label(" 文本框二 ");
		labelthree = new Label(" 文本框三 ");
		add = new Button(" 加法 ");
		exit = new Button(" 退出 ");
		add.addActionListener(this);// 实例化以上组件
		exit.addActionListener(this);// 实例化以上组件
		f.add(labelone);
		f.add(a);
		f.add(labeltwo);
		f.add(b);
		f.add(labelthree);
		f.add(c);
		f.add(add);// 添加以上组件
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
			c.setText(String.valueOf(z));// 把文本框一和二的字体的和显示在文本框三中
		} else if (e.getSource() == exit)
			System.exit(0);
	}

	public static void main(String[] args) {
		new Test04();
	}
}
