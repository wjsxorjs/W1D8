package pm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

public class Canvas_Ex7 extends Canvas {
	
	ArrayList<MyOval> list; // MyOval을 저장할 수 있는 list
	
	public Canvas_Ex7() {
		list = new ArrayList<MyOval>();
	}
	
	@Override
	public void paint(Graphics g) {
		
		// 기본적으로 지워진 캔버스에 다시 처음부터 하나씩 그리는 것이나 마찬가지이다.
		// 다만, 필요한 정보: x,y좌표값. 너비(w)높이(h)값. 색상(rgb)값들이 모두 list안에 저장된
		// MyOval 객체에 저장되어있으므로 마치 지워지지않고 계속 남아있는 듯한 느낌을 주는 것이다.
		for(int i=0; i<list.size(); i++) {
			//리스트로부터 요소를 하나씩 가져오기
			MyOval m = list.get(i);
			g.setColor(m.c);
			g.fillOval(m.x, m.y, m.w, m.h);
		}
	}

}
