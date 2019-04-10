package sheridan;
 import javax.swing.JFrame;
 
 public class windowTest extends JFrame {
  
 
  public static void main(String[] args) {
   // TODO Auto-generated method stub
   windowTest gui = new windowTest();
   gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   gui.setSize(1000, 1000);
   gui.setVisible(true);
   gui.setTitle("WindowTest GUI");
  }
 
 }
