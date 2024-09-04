import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisplay {
    public static void main(String[] args) {
        // Create a JFrame to display the image
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image
        String imagePath = "Fyodor.PNG"; // Adjust this path as needed
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Check if the image was loaded successfully
        if (imageIcon.getIconWidth() == -1) {
            System.out.println("Image not found: " + imagePath);
        } else {

        // Create a JLabel to hold the image
        JLabel label = new JLabel(imageIcon);

        // Add the label to the frame
        frame.add(label);

        // Set the size of the frame
        frame.pack();
        frame.setSize(400, 400);

        // Make the frame visible
        frame.setVisible(true);
    }
}
}