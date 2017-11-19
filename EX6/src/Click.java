import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

 
public class Click extends JFrame{ 
	public Click() { 
 		super("클릭 연습용 응용프로그램"); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 		Container c = getContentPane(); 
 		 
		JLabel la = new JLabel("C"); // JLabel 글자 출력
 		la.setSize(10, 10); //라벨 사이즈 설정
 		la.setLocation(100, 100); 
 		c.add(la); 
 		 
 		la.addMouseListener(new MouseAdapter() { 
 			public void mouseClicked(MouseEvent e) { 
 				JLabel label = (JLabel)e.getSource(); 
 				int x = (int)(Math.random() * 100); 
 				int y = (int)(Math.random() * 100); 
 				label.setLocation(x, y); // 클릭시 랜덤위치로 이동 
 			} 
 		}); 
 		 
 		setSize(300, 300); 
 		setVisible(true); 
 	} 
 	public static void main(String[] args) { 
 		new Click(); 
 	} 
 } 
