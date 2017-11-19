import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LeftKey extends JFrame {

 JLabel label; //label을 전역변수로 선언
 LeftKey() {
  setTitle("Chapter 10. Exercise 4");
  setSize(300, 150);
  setLocation(400, 400);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new FlowLayout());

  label = new JLabel("Java Love");
  add(label);
  addKeyListener(new MyKeyListener());
  label.requestFocus();
  setVisible(true);
 }

 public class MyKeyListener extends KeyAdapter implements KeyListener {
  public void keyPressed(KeyEvent e) {
   if (e.getKeyCode() == KeyEvent.VK_LEFT) {

//    JLabel la = (JLabel)e.getSource(); //label의 소스를 얻어오는대신 전역변수 label을 그대로 사용
    String text = label.getText();
    String text1 = text.substring(0, 1);
    String text2 = text.substring(1);
    label.setText(text2.concat(text1));
   }
  }
 }


 public static void main(String[] args) {
  new LeftKey();
 }
 }
