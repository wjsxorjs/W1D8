package pm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyFrameEx6 extends JFrame implements MouseListener {
	
	Canvas_Ex6 can;
	
	public MyFrameEx6() {
		
		can = new Canvas_Ex6();
		
		this.add(can);
		
		this.setBounds(300, 150, 600, 600);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		can.addMouseListener(this);
		
		
	}

	public static void main(String[] args) {
		new MyFrameEx6();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스를 누를 때마다 수행하는 곳
		can.x = e.getX();
		can.y = e.getY();
		
		can.repaint();		// -- update() -- paint() -->
							//     지우기     그리기     역할
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
