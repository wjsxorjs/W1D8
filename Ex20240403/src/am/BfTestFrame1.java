package am;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BfTestFrame1 extends JFrame implements ActionListener {
	
	JButton bt1, bt2, bt3;
	
	JPanel pl1;
	
	JTextField tf1;
	
	public BfTestFrame1() {
		bt1 = new JButton("-");
		bt2 = new JButton("RESET");
		bt3 = new JButton("+");
		 
		pl1 = new JPanel();
		
		tf1 = new JTextField("0",3);
		
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		
		pl1.add(bt1);
		pl1.add(bt2);
		pl1.add(bt3);
		
		
		this.add(tf1,BorderLayout.NORTH);
		this.add(pl1);
		
		this.setBounds(300, 150, 500, 400);
		this.setVisible(true);
		
		this.addWindowListener(new BfTestWinAdpt());
		
	}
	

	public static void main(String[] args) {
		
		new BfTestFrame1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		String s = tf1.getText();
		
		if(s.length()==0) {
			return;
		}
		
		int tmp = Integer.parseInt(s);
		
		if(obj == bt1) {
			tmp -= 1;
			tf1.setText(String.valueOf(tmp));
		} else if(obj == bt2) {
			tf1.setText("0");
		} else {
			tmp += 1;
			tf1.setText(String.valueOf(tmp));
		}
		
		
		
	}

}
