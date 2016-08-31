package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * Main panel for game.
 * 
 * @author Drew
 *
 */
public class GamePanel extends JPanel implements Runnable, ActionListener {

   // Gets screen resolution and stores it
   public static Dimension screenSize = new Dimension(
         Toolkit.getDefaultToolkit().getScreenSize());

   private boolean running;

   private Thread thread = new Thread(this);

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
       *  -speed-of-object
       */
      while (true) {

      }
   }

}
