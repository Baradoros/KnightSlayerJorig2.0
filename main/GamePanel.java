package main;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**
 * Main panel for game.
 * 
 * @author Drew
 *
 */
public class GamePanel extends JPanel implements Runnable {

   // Gets screen resolution and stores it
   public static Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
   public static Dimension resolution = new Dimension(800, 600);
   private final int TARGET_FPS = 60;
   private int fullScreen;

   // Game Thread
   private Thread gameThread = new Thread(this);

   // Canvas and paint brush
   private BufferedImage image;
   private Graphics2D g;

   public GamePanel() {
      fullScreen = 0;
      if (fullScreen != 0)
      setPreferredSize(resolution);
      else if (fullScreen == 1) {
         setPreferredSize(screenSize);
      }
         
      setFocusable(true);
      requestFocus();

      if (fullScreen == 0) // Windowed
         image = new BufferedImage(resolution.width, resolution.height, BufferedImage.TYPE_INT_RGB);
      else if (fullScreen == 1) // FullScreen windowed
         image = new BufferedImage(screenSize.width, screenSize.height, BufferedImage.TYPE_INT_RGB);
      g = (Graphics2D) image.getGraphics();
   }

   @Override
   public void run() {

      // GAME LOOP

      /**
       * Fixed Timestep with synchronization
       * 
       * @author Drew
       */
      while (true) {
         long currentTime = System.currentTimeMillis();
         long targetTime = 1000 / TARGET_FPS;

         // GAME/////////////////////////////////////////////////////////////////////////////////

         // END//////////////////////////////////////////////////////////////////////////////////
         long elapsed = System.currentTimeMillis() - currentTime;
         long wait = targetTime - elapsed;

         try {
            Thread.sleep(wait);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

}
