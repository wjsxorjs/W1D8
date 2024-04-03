package pm;

import java.awt.Color;

public class MyOval {
	
	
	Color c; // 색상
	
	int x, y, w, h; // x, y좌표 | 너비w, 높이h
	
	// 이 중 난수 값이 아닌 것은 x와 y다.
	
	public MyOval(int x, int y) {
		
		//this.멤버변수x = 인자변수x : 인자 변수 X를 멤버변수 X 즉, this.x에 저장한다.
		this.x = x;
		this.y = y;
		
		// 색상 난수값
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		c = new Color(red, green, blue);
		
		// 너비높이 난수값
		
		w = (int)(Math.random()*150+50);
		h = (int)(Math.random()*150+50);
		
		// 중앙으로 재배치
		this.x = x - (w/2);
		this.y = y - (h/2);
		
	}
	

}
