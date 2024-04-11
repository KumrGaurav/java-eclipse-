//using JOptionPane
import javax.swing.*;
public class Salary {


	public static void main(String[] args) {
		JFrame f;
		// TODO Auto-generated method stub
		//System.out.println("Enter incomeTaxPercentage:-> ");
		//Scanner sc = new Scanner(System.in);
		//int incomeTaxPercentage = sc.nextInt();
		
		int incomeTaxPercentage = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter income tax percentage"));
		String name = JOptionPane.showInputDialog(null,"Enter your name:-");
		int numberOfDays = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of days worked:-"));
		double dailyWage = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your daily wage:-"));
		double grossSal = numberOfDays*dailyWage;
		double taxAmount = (incomeTaxPercentage/100.0)*grossSal;
		double netSal = grossSal - taxAmount;
		f = new JFrame();
		JOptionPane.showMessageDialog(f,"The gross salary of "+name+" is "+grossSal+" and net salary is "+netSal);
	}

}
