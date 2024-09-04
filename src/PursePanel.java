import java.awt.*;
import javax.swing.*;
import java.util.Map;

public class PursePanel extends JPanel {

    public PursePanel() {
        // Initialize components for PursePanel
        setLayout(new GridLayout(0, 2)); // Use GridLayout to arrange labels in a grid
        displayTest();
    }
   
    public void displayTest() {
        removeAll(); 
        // Create an ImageIcon with the path to the image file
        String imagePath = "1.PNG"; // Adjust this path as needed
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Check if the image was loaded successfully
        if (imageIcon.getIconWidth() == -1) {
            System.out.println("Image not found: " + imagePath);
        } else {
            // Create a JLabel with the ImageIcon
            JLabel testLabel = new JLabel(imageIcon);
            add(testLabel);
        }

        revalidate();
        repaint();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Purse Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        PursePanel pursePanel = new PursePanel();
        frame.add(pursePanel);
        pursePanel.displayTest();
        frame.setVisible(true);
    }



}

