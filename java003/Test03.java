package java003;

import java.awt.*;
import java.awt.event.*;

public class Test03 {
	public static void main(String args[]) {
		new FrameInOut();
	}
}

class FrameInOut extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label prompt;
	TextField input, output;
	Button btnn;

	void FramInOut() {
		prompt = new Label("Please input your name");
		input = new TextField(10);
		output = new TextField(25);
		btnn = new Button("Close");
		setLayout(new FlowLayout());
		add(prompt);
		add(input);
		add(output);
		add(btnn);
		input.addActionListener(this);
		btnn.addActionListener(this);
		setSize(300,200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == input)
			output.setText(input.getText() + "Welcome you!");
		else {
			dispose();
			System.exit(0);
		}
	}
}