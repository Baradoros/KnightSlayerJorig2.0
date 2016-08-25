package main;

import javax.swing.JFrame;

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
