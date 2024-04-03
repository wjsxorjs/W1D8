package pm;

import java.awt.Canvas;

import javax.swing.JFrame;

public class MyFrameEx5 extends JFrame {

	
	Canvas_Ex5 can;
	
	
	
	public MyFrameEx5() {
		this.setTitle("My DrawingBoard");
		
		can = new Canvas_Ex5();
		this.add(can);
		
		
		this.setBounds(300, 150, 600, 600);
		this.setVisible(true);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		new MyFrameEx5();

	}

}
