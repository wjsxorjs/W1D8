package pm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Canvas_Ex5 extends Canvas {

	
	@Override
	public void paint(Graphics g) {
		// 객체가 생성되면 자동으로 JVM이 호출된다.
		// 인자인 Graphics는 부모객체로부터 얻어내어 전달해준다.
		// Graphics는 붓과 같은 존재이다.
		
		
		g.drawRect(10, 10, 100, 100);
		g.drawRect(15, 15, 90, 90);
		
		g.setColor(Color.RED);
		g.fillRect(20, 20, 80, 80);

		g.setColor(Color.BLUE);
		g.fillOval(20, 20, 80, 80);
		
		g.setColor(Color.CYAN);
		g.fillOval(140, 10, 100, 100);
		
		g.setColor(Color.ORANGE);
		g.drawString("쌍용교육센터", 250,  70);
		
		
	}
	
	

}
