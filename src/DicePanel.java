import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DicePanel extends JPanel {
    private final Dice dice;

    private JButton rollButton;
    private JButton rollButton1;
    private JLabel displayLabel;

    public DicePanel(Dice dice) {
        this.dice = dice;

        rollButton = new JButton("Roll");
        rollButton1 = new JButton("Test");
        displayLabel = new JLabel();

        rollButton.addActionListener(e -> {
                displayLabel.setText("You rolled a: " + dice.roll());
                System.out.println("Hello World!");}
        );
        // or if you're not using Java 8, you can do the more verbose thing.

        // not specifying a layout defaults to a flow layout.  Set a layout via:
        // setLayout(new BorderLayout()); // or whatever
        add(rollButton);
        add(rollButton1);
        add(displayLabel);
    }
}