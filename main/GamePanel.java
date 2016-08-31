package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GamePanel extends JFrame implements Runnable, ActionListener {

   // Gets screen resolution and stores it
   public static Dimension screenSize = new Dimension(
         Toolkit.getDefaultToolkit().getScreenSize());
   
   public GamePanel() {
      setPreferredSize(screenSize);
      setFocusable(true);
      requestFocus();
   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub

   }

   @Override
   public void run() {
      // TODO Auto-generated method stub

   }

}
