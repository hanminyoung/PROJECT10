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
  contentPane.setBackground(Color.GREEN);//����Ʈ���� ������ �ʷϻ�
  
  contentPane.addMouseMotionListener(new MouseMotionAdapter()//���콺 ��� �߰��ϱ�
  {
   public void mouseDragged(MouseEvent e) {
	   contentPane.setBackground(Color.YELLOW);//���콺 �巹���ϸ� �����
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
