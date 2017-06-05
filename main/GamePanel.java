package main;

import java.awt.Dimension;
import java.awt.Toolkit;

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

   private Thread thread = new Thread(this);

   public GamePanel() {
      setPreferredSize(resolution);
      setFocusable(true);
      requestFocus();
   }

   @Override
   public void run() {

      // GAME LOOP
      /*
       * This game loop is going to be tricky. I did a bit of research on
       * framerates and how to regulate them and we need to be sure we update
       * the game independent of rendering. We need to be extra sure that the
       * game logic is never dependent on framerate. The method that I used
       * previously works when the framerate is too high and stuff is flying
       * around at lightspeed, but on a slow computer everything will still move
       * slowly.
       * 
       * http://gamedev.stackexchange.com/questions/97933/framerate-is-affecting
       * -speed-of-object
       * 
       * Fixed TimeStep with Synchronization
       */

      while (true) {
         long currentTime = System.currentTimeMillis();
         long targetTime = 1000 / TARGET_FPS;

         // GAME/////////////////////////////////////////////////////////////////////////////////

         
         
         // END GAME/////////////////////////////////////////////////////////////////////////////
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
