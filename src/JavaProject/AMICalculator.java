package JavaProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AMICalculator {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("Interest Calculator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(null);

        JButton sbButton = new JButton("Interest Calculator - Saving Bank");
        sbButton.setBounds(50, 50, 300, 30);

        JButton fdButton = new JButton("Interest Calculator - Fixed Deposit");
        fdButton.setBounds(50, 100, 300, 30);

        JButton rdButton = new JButton("Interest Calculator - Required Deposit");
        rdButton.setBounds(50, 150, 300, 30);

        mainFrame.add(sbButton);
        mainFrame.add(fdButton);
        mainFrame.add(rdButton);

        sbButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openSBAccountWindow();
            }
        });

        fdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFDWindow();
            }
        });

        rdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRDWindow();
            }
        });

        mainFrame.setVisible(true);
    }
    
    private static void openSBAccountWindow() {
        JFrame sbFrame = new JFrame("Savings Bank Account Calculator");
        sbFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sbFrame.setSize(400, 300);
        sbFrame.setLayout(null);

        JLabel amountLabel = new JLabel("Enter the Average Saving Bank Amount:");
        amountLabel.setBounds(50, 50, 300, 30);

        JTextField amountTextField = new JTextField();
        amountTextField.setBounds(50, 80, 150, 30);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 120, 100, 30);

        JTextArea resultTextArea = new JTextArea();
        resultTextArea.setBounds(220, 80, 150, 150);
        resultTextArea.setEditable(false);

        sbFrame.add(amountLabel);
        sbFrame.add(amountTextField);
        sbFrame.add(calculateButton);
        sbFrame.add(resultTextArea);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountTextField.getText());

                    SBaccount sb = new SBaccount();
                    double interest = sb.calculateIntrest(amount);

                    resultTextArea.setText("Interest gained is: RS " + interest);
                } catch (NumberFormatException ex) {
                    resultTextArea.setText("Invalid input! Please enter a valid number.");
                } catch (InvalidAmountException ex) {
                    resultTextArea.setText("Exception: Invalid amount");
                } catch (InvalidMonthsException ex) {
                    resultTextArea.setText("Invalid Months Entered");
                } catch (InvalidAgeException ex) {
                    resultTextArea.setText("Invalid Age Entered");
                } catch (InvalidDaysException ex) {
                    resultTextArea.setText("Invalid Days Entered");
                }
            }
        });

        sbFrame.setVisible(true);
    }

    // Similarly, you can complete openFDWindow() and openRDWindow() methods...
    
    private static void openFDWindow() {
        JFrame fdFrame = new JFrame("Fixed Deposit Calculator");
        fdFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fdFrame.setSize(400, 300);
        fdFrame.setLayout(null);

        JLabel amountLabel = new JLabel("Enter the Fixed Deposit Amount:");
        amountLabel.setBounds(50, 50, 300, 30);

        JTextField amountTextField = new JTextField();
        amountTextField.setBounds(50, 80, 150, 30);

        JLabel daysLabel = new JLabel("Enter days of FD Holder:");
        daysLabel.setBounds(50, 120, 150, 30);

        JTextField daysTextField = new JTextField();
        daysTextField.setBounds(50, 150, 150, 30);

        JLabel ageLabel = new JLabel("Enter age of FD Holder:");
        ageLabel.setBounds(50, 190, 150, 30);

        JTextField ageTextField = new JTextField();
        ageTextField.setBounds(50, 220, 150, 30);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 260, 100, 30);

        JTextArea resultTextArea = new JTextArea();
        resultTextArea.setBounds(220, 80, 150, 150);
        resultTextArea.setEditable(false);

        fdFrame.add(amountLabel);
        fdFrame.add(amountTextField);
        fdFrame.add(daysLabel);
        fdFrame.add(daysTextField);
        fdFrame.add(ageLabel);
        fdFrame.add(ageTextField);
        fdFrame.add(calculateButton);
        fdFrame.add(resultTextArea);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountTextField.getText());
                    int noOfDays = Integer.parseInt(daysTextField.getText());
                    int ageOfACHolder = Integer.parseInt(ageTextField.getText());

                    FDaccount fd = new FDaccount();
                    fd.noOfDays = noOfDays;
                    fd.ageOfACHolder = ageOfACHolder;
                    double interest = fd.calculateIntrest(amount);

                    resultTextArea.setText("Interest gained is: RS " + interest);
                } catch (NumberFormatException ex) {
                    resultTextArea.setText("Invalid input! Please enter valid numbers.");
                } catch (InvalidAmountException ex) {
                    resultTextArea.setText("Exception: Invalid amount");
                } catch (InvalidAgeException ex) {
                    resultTextArea.setText("Invalid Age Entered");
                } catch (InvalidDaysException ex) {
                    resultTextArea.setText("Invalid Days Entered");
                } catch (InvalidMonthsException ex) {
                    resultTextArea.setText("Invalid Months Entered");
                }
            }
        });

        fdFrame.setVisible(true);
    }
    
    private static void openRDWindow() {
        JFrame rdFrame = new JFrame("Required Deposit Calculator");
        rdFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rdFrame.setSize(400, 300);
        rdFrame.setLayout(null);

        JLabel amountLabel = new JLabel("Enter the Required Deposit Amount:");
        amountLabel.setBounds(50, 50, 300, 30);

        JTextField amountTextField = new JTextField();
        amountTextField.setBounds(50, 80, 150, 30);

        JLabel monthsLabel = new JLabel("Enter RD holder months:");
        monthsLabel.setBounds(50, 120, 150, 30);

        JTextField monthsTextField = new JTextField();
        monthsTextField.setBounds(50, 150, 150, 30);

        JLabel ageLabel = new JLabel("Enter RD holder age:");
        ageLabel.setBounds(50, 190, 150, 30);

        JTextField ageTextField = new JTextField();
        ageTextField.setBounds(50, 220, 150, 30);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 260, 100, 30);

        JTextArea resultTextArea = new JTextArea();
        resultTextArea.setBounds(220, 80, 150, 150);
        resultTextArea.setEditable(false);

        rdFrame.add(amountLabel);
        rdFrame.add(amountTextField);
        rdFrame.add(monthsLabel);
        rdFrame.add(monthsTextField);
        rdFrame.add(ageLabel);
        rdFrame.add(ageTextField);
        rdFrame.add(calculateButton);
        rdFrame.add(resultTextArea);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountTextField.getText());
                    int noOfMonth = Integer.parseInt(monthsTextField.getText());
                    int age = Integer.parseInt(ageTextField.getText());

                    RDaccount rd = new RDaccount();
                    rd.noOfMonth = noOfMonth;
                    double interest = rd.calculateIntrest(amount);

                    resultTextArea.setText("Interest gained is: RS " + interest);
                } catch (NumberFormatException ex) {
                    resultTextArea.setText("Invalid input! Please enter valid numbers.");
                } catch (InvalidAmountException ex) {
                    resultTextArea.setText("Exception: Invalid amount");
                } catch (InvalidMonthsException ex) {
                    resultTextArea.setText("Invalid Months Entered");
                } catch (InvalidAgeException ex) {
                    resultTextArea.setText("Invalid Age Entered");
                }
            }
        });

        rdFrame.setVisible(true);
    }

    
}

