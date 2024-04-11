package SELab;

import javax.swing.*;
import java.util.*;

public class WarehouseAPI extends JFrame {
    private JPanel loginPanel;
    private JPanel warehousePanel;
    private JTextField warehouseIdField;
    private JComboBox<String> temperatureComboBox;
    private JComboBox<String> humidityComboBox;
    private JComboBox<String> powerStatusComboBox;
    private JTextField quantityField;
    private JButton checkConditionButton;
    private JLabel warehouseConditionLabel;
    private JLabel quantityStatusLabel;

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private String correctUsername = "gaurav";
    private String correctPassword = "mca1004122";

    private boolean loggedIn = false;

    public WarehouseAPI() {
        // Initialize the components for login panel
        loginPanel = new JPanel();
        usernameField = new JTextField(10);
        passwordField = new JPasswordField(10);
        loginButton = new JButton("Login");

        // Set the layout and add the components to the login panel
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        loginPanel.add(new JLabel("Username: "));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password: "));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        // Add an action listener to the login button
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loggedIn = true;
                remove(loginPanel);
                JOptionPane.showMessageDialog(null, "Successfully logged in.");
                add(warehousePanel);
                pack(); // Resize the frame to fit the new content
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password.");
            }
        });

        // Initialize the components for warehouse panel
        warehousePanel = new JPanel();
        warehouseIdField = new JTextField(20);
        temperatureComboBox = new JComboBox<>(new String[]{"high", "moderate", "low"});
        humidityComboBox = new JComboBox<>(new String[]{"high", "moderate", "low"});
        powerStatusComboBox = new JComboBox<>(new String[]{"on", "off"});
        quantityField = new JTextField(20);
        checkConditionButton = new JButton("Check Warehouse Condition");
        warehouseConditionLabel = new JLabel("");
        quantityStatusLabel = new JLabel("");

        // Set the layout and add the components to the warehouse panel
        warehousePanel.setLayout(new BoxLayout(warehousePanel, BoxLayout.Y_AXIS));
        warehousePanel.add(new JLabel("Warehouse ID: "));
        warehousePanel.add(warehouseIdField);
        warehousePanel.add(new JLabel("Temperature: "));
        warehousePanel.add(temperatureComboBox);
        warehousePanel.add(new JLabel("Humidity: "));
        warehousePanel.add(humidityComboBox);
        warehousePanel.add(new JLabel("Power Status: "));
        warehousePanel.add(powerStatusComboBox);
        warehousePanel.add(new JLabel("Quantity of Packages: "));
        warehousePanel.add(quantityField);
        warehousePanel.add(checkConditionButton);
        warehousePanel.add(warehouseConditionLabel);
        warehousePanel.add(quantityStatusLabel);

        // Add an action listener to the check condition button
        checkConditionButton.addActionListener(e -> {
        	if (loggedIn == false) {
                JOptionPane.showMessageDialog(null, "Please log in to use the Warehouse API.");
                return;
            } else {
            	// Get the input values from the components
                String warehouseId = warehouseIdField.getText();
                String temperature = (String) temperatureComboBox.getSelectedItem();
                String humidity = (String) humidityComboBox.getSelectedItem();
                String powerStatus = (String) powerStatusComboBox.getSelectedItem();
                int quantity = Integer.parseInt(quantityField.getText());

                // Check the condition of the warehouse
                String condition = checkWarehouseCondition(temperature, humidity, powerStatus);
                
                // Update the warehouse condition label
                

                // Check the quantity of the warehouse
                String Quantity = checkWarehouseQuantity(quantity);

                // Update the quantity status label
                
                
                JOptionPane.showMessageDialog(null, "The warehouse condition is " + condition + "\nand the warehouse storage capacity is " + Quantity);
            }
        });

        // Set the properties of the JFrame
        setTitle("Warehouse API");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Add the login panel to the JFrame
        add(loginPanel);

        // Make the JFrame visible
        setVisible(true);
    }

    /**
     * Checks the condition of the warehouse based on the temperature, humidity, and power status.
     *
     * @param temperature  The temperature of the warehouse.
     * @param humidity     The humidity of the warehouse.
     * @param powerStatus  The power status of the warehouse.
     * @return             A string representing the condition of the warehouse.
     */
    private String checkWarehouseCondition(String temperature, String humidity, String powerStatus) {
    	String condition="";
        if (temperature.equals("high") && humidity.equals("high") && powerStatus.equals("off")) {
            condition="dangerous";
        } else if (temperature.equals("high") || humidity.equals("high") || powerStatus.equals("off")) {
            condition="poor";
        } else {
            condition="good";
        }
		return condition;
    }

    /**
     * Checks the quantity of the warehouse and returns a string indicating whether the warehouse is full, half full,
     * or empty.
     *
     * @param quantity  The quantity of packages in the warehouse.
     * @return          A string representing the quantity status of the warehouse.
     */
    private String checkWarehouseQuantity(int quantity) {
    	String Quantity="";
        if (quantity == 0) {
            Quantity="empty";
        } else if (quantity < 400) {
            Quantity="vacant";
        } else if(quantity>400) {
            Quantity="Over load";
        }else {
        	Quantity="full";
        }
        return Quantity;
    }

    public static void main(String[] args) {
        new WarehouseAPI();
        //WarehouseAPI api = new WarehouseAPI();
    }
}

        

