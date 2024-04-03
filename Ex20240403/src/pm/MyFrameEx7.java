package pm;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyFrameEx7 extends JFrame implements MouseListener {
	
	Canvas_Ex7 can;
	
	public MyFrameEx7() {
		
		can = new Canvas_Ex7();
		
		this.add(can);
		
		this.setBounds(300, 150, 600, 600);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Mouse 이벤트를 감지하는 곳이 Canvas이므로 Canvas객체인 can에서 부른다.
		// MouseListner를 구현한 객체의 주소값을 가진 것은 현재 객체의 주소값을 가지는 this이므로
		// can.MouseListener(this);
		can.addMouseListener(this);
		
		
	}

	public static void main(String[] args) {
		new MyFrameEx7();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스를 누를 때마다 수행하는 곳
		
		int x = e.getX();
		int y = e.getY();
		
		MyOval m = new MyOval(x, y);
		// 생성한 MyOval값을 Canvas의 멤버변수인 ArrayList<MyOval>안에 추가(저장)해준다.
		can.list.add(m);
		
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
