package main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Main driver for game.
 * @author Drew
 *
 */
public class Game extends JFrame {

   // Gets screen resolution and stores it
   public static Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
   public static Dimension resolution = new Dimension(800, 600);
   private int fullScreen = 0;;

   public Game() {
      setTitle("Knight Slayer Jorig");
      setContentPane(new GamePanel(fullScreen));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      pack();
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new Game();
   }
}
