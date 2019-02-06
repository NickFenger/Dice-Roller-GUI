import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {

   private boolean keepPlaying = true;

    static JFrame frameOne = new JFrame("Dice Roller");

    public static void main(String[] args) {
        new Main();
    }


    public Main(){


        System.out.println("Let's play Yahtzee");
        Dice die = new Dice(6);
        DicePanel panel = new DicePanel(die);
        frameOne.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frameOne.add(panel);

        while (keepPlaying) {
            frameOne.setVisible(true);
            System.out.println("loop");
        }
    }
}

