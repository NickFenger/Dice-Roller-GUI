import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
   static JFrame frameOne = new JFrame("Dice Roller");
    public static void main(String[] args) {
         System.out.println("Hello World!");

        Dice die = new Dice(6);
        DicePanel panel = new DicePanel(die);
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frameOne.add(panel);
        frameOne.setVisible(true);
    }
}

