package main;

import javax.swing.JFrame;

/**
 * Main driver for game.
 * @author Drew
 *
 */
public class Game extends JFrame {

   public Game() {
      setTitle("Knight Slayer Jorig");
      setContentPane(new GamePanel());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      pack();
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new Game();
   }
}
