import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    private JTextField amountField;
    private JButton convertButton;
    private JTextArea resultArea;

    public RegisterPanel() {
        setLayout(new BorderLayout());

        // Create components
        amountField = new JTextField(10);
        convertButton = new JButton("Convert to Change");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        // Create a panel for the input and button
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(convertButton);

        // Add components to the main panel
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertAmount();
            }
        });
    }

    private void convertAmount() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            Purse change = new Register().makeChange(amount);
            resultArea.setText(change.toString());
        } catch (NumberFormatException e) {
            resultArea.setText("Invalid amount entered. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new RegisterPanel());
        frame.setVisible(true);
    }
}

