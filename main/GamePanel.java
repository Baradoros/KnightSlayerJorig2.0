package main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**
 * Main panel for game.
 * 
 * @author Drew
 *
 */
public class GamePanel extends JPanel implements Runnable {

   private final int TARGET_FPS = 60;
   // Game Thread
   private Thread gameThread = new Thread(this);

   // Canvas and paint brush
   private BufferedImage image;
   private Graphics2D g;

   public GamePanel(int fullScreen) {
      if (fullScreen != 0)
         setPreferredSize(Game.resolution);

      setFocusable(true);
      requestFocus();

      if (fullScreen == 0) // Windowed
         image = new BufferedImage(Game.resolution.width, Game.resolution.height, BufferedImage.TYPE_INT_RGB);
      else if (fullScreen == 1) // FullScreen windowed
         image = new BufferedImage(Game.screenSize.width, Game.screenSize.height, BufferedImage.TYPE_INT_RGB);
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
