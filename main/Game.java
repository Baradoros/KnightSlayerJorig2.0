package main;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import org.omg.PortableServer.ServantRetentionPolicyOperations;

/**
 * Main driver for game.
 * 
 * @author Drew
 *
 */
public class Game extends JFrame {

   // Gets screen resolution and stores it
   public static Dimension screenSize = new Dimension(
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode()
               .getWidth(),
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode()
               .getHeight());

   // Non-full screen resolution
   public static Dimension resolution = new Dimension(800, 600);

   // Full screen mode
   private int fullScreen = 0;

   public Game() {
      setTitle("Knight Slayer Jorig");

      if (fullScreen == 1) { // Full screen windowed
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setUndecorated(true);
      } else if (fullScreen == 2) {
         setUndecorated(true);
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
      }
      setContentPane(new GamePanel(fullScreen));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      pack();
      if (fullScreen == 0) // Cause window to appear in center of screen when not fullscreened
         setLocationRelativeTo(null);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Game();
   }
}
