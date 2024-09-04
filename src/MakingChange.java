import java.awt.*;
import javax.swing.*;

public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Making Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 900));
        frame.pack();
        frame.setLayout(new GridLayout(2, 1));

        
        frame.add(new RegisterPanel());
        frame.add(new PursePanel());
        frame.setVisible(true);


    }
}
