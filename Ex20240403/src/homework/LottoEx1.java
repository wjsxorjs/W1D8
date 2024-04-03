package homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoEx1 extends JFrame implements ActionListener {
	
	JPanel north_p, center_p;
	
	JButton bt;
	
	int[] ar;
	
	public LottoEx1() {
		ar = new int[6];
		// 화면구성
		north_p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		bt = new JButton("생성");
//		north_p.add(bt);
		north_p.add(bt = new JButton("생성"));
		
		
		
		// 버튼을 우측정렬로 배치한 north_p를
		// 현재 창의 North영역에 추가한다.
		this.add(north_p,BorderLayout.NORTH);
		
		
		// 현재 창의 가운데에 center_p를 생성하여 추가한다.
		this.add(center_p = new JPanel());
		
		
		
		this.setBounds(200, 100, 800, 250);
		this.setVisible(true);
		
		this.addWindowListener(new MyWin());
		
		bt.addActionListener(this);
		
		
	}
	
	

	public static void main(String[] args) {
		new LottoEx1();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// "생성" Button을 클릭할 때마다 수행하는 곳!!
		
		// 배열을 생성하여 난수를 저장한다. !중복체크까지 수행한다.
//		this.setAr();
//		this.setLabel(); 	// 난수가 모두 만들어진 배열을 활용하여
							// ImageIcon 생성 후 JLabel 생성하여
							// Jpanel(center_p)에 추가하는 동작.
		this.setAr();
		this.setLabel();
		
		
	}
	
	private void setAr() {
		// 배열은 멤버변수로 선언하였고
		// 생성자에서 생성하였으므로 생성하지 않아도 된다.
		
		for(int i=0; i<ar.length;) {
			int r = (int) (Math.random() * 45 +1); // 1부터 45까지의 난수 발생
			
			ar[i] = r;
			
			// 중복 여부를 판단하기위한 논리형 변수 필요 
			boolean chk = true; // 이 값을 유지한다면 중복되지않았다는 뜻
			
			//중복체크 반복문
			for(int j=0; j<i;j++) {
				if(ar[i]==ar[j]) {
					chk = false;	// 중복된 값이 있다.
					break;			// 가장 가까운 반복문 탈출
				}
			}
			
			// 중복된 값이 없을 때만(chk가 true일 때) i값을 증가시킨다.
			if(chk) {
				i++;
			}
						
		}
		
	}
	
	private void setLabel() {
		// center_p에 JLabel을 그리기 전에 이미 center_p에 있는
		// 내용을 모두 지워야한다.
		center_p.removeAll();
		
		for(int i=0; i<ar.length; i++) {
//			String path = "src/images/lotto/"+ar[i]+".gif";
			StringBuffer sb = new StringBuffer("src/images/lotto/");
			sb.append(ar[i]);
			sb.append(".gif");
			
			//위의 경로를 이용해 ImageIcon 생성
			ImageIcon icon = new ImageIcon(sb.toString());
			
			//해당 ImageIcon을 이용하여 JLabel 생성
			JLabel lb = new JLabel(icon);
			
			//해당 JLabel을 center_p에 추가
			center_p.add(lb);
		} // 반복문의 끝
		
		center_p.revalidate();
		
	}
	
	

}
