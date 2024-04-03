package pm;

import javax.swing.JFrame;

public class MyFrameEx6 extends JFrame  {
	
	Canvas_Ex6 can;
	
	public MyFrameEx6() {
		
		can = new Canvas_Ex6();
		
		this.add(can);
		
		this.setBounds(300, 150, 600, 600);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new MyFrameEx6();

	}

}
