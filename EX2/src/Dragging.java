import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dragging extends JFrame {
 JPanel contentPane = new JPanel();
 Dragging () {
  setTitle("Chapter 10. Exercise 2");
  setSize(300, 300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  

  setContentPane(contentPane);
  contentPane.setBackground(Color.GREEN);//컨텐트팬의 배경색은 초록색
  
  contentPane.addMouseMotionListener(new MouseMotionAdapter()//마우스 모션 추가하기
  {
   public void mouseDragged(MouseEvent e) {
	   contentPane.setBackground(Color.YELLOW);//마우스 드레그하면 노란색
   }
   public void mouseMoved(MouseEvent e) {
    contentPane.setBackground(Color.GREEN);
   }
  }
  );
  setVisible(true);
 }
 public static void main(String[] args) {
  new Dragging();
 }
}
