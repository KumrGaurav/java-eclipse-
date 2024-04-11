/*AIM Interest Calculator:-
Calculate interest based on the type of the account and the status of the account holder. 
The rates of interest changes according to the amount (greater than or less than 1 crore), 
age of account holder (General or Senior citizen) and number of days if the type of account
is FD = Fixes Deposit or RD = Required Deposit or SB = Saving Bank.
*/


package JavaProject;
import java.util.*;
abstract class Account{
	private double intrestRate;
	private double amount;
	abstract double calculateIntrest(double amount)throws InvalidMonthsException,
	InvalidAgeException, InvalidAmountException, InvalidDaysException;
	
}
class RDaccount extends Account{
	private double RDInterestRate;
	private double RDamount;
	int noOfMonth;
	private double monthlyAmount;
	private double General,SCitizen;
	Scanner RDScanner = new Scanner(System.in);
	
	

	@Override
	double calculateIntrest(double Ramount)throws InvalidMonthsException,
	InvalidAmountException,InvalidAgeException {
		this.RDamount=Ramount;
		System.out.println("Enter RD holder days :-");

		noOfMonth = RDScanner.nextInt();
		System.out.println("Enter RD holder age :-");
		int age = RDScanner.nextInt();
		if(RDamount<0) {
			throw new InvalidAmountException();
			
		}
		if(noOfMonth<0) {
			throw new InvalidMonthsException();
			
		}
		if(age<0) {
			throw new InvalidAgeException();
			
		}
		if(noOfMonth>=0 && noOfMonth<=6) {
			General = 0.0750;
			SCitizen = 0.080;
			
		}
		else if(noOfMonth>=7 && noOfMonth<=9) {
			General = 0.0775;
			SCitizen = 0.0825;
		}
		else if(noOfMonth>10 && noOfMonth<=12) {
			General = 0.0800;
			SCitizen = 0.0850;
			
		}
		else if (noOfMonth >= 13 && noOfMonth <= 15) {
			General = .0825;
			SCitizen = 0.0875;
		}
		else if (noOfMonth >= 16 && noOfMonth <= 18) {
			General = .0850;
			SCitizen = 0.0900;
		}
		else if (noOfMonth >= 22) {
			General = .0875;
			SCitizen = 0.0925;
		}
		
		
	
	RDInterestRate = (age < 50) ? General : SCitizen; 
	return RDamount * RDInterestRate;
	
	
	}
}
class SBaccount extends Account{
	double SBamount;
	double SbInterestRate;
	double intrest;
	
	Scanner SBScanner = new Scanner(System.in);
	
	@Override
	double calculateIntrest(double amount)throws InvalidMonthsException,
	InvalidAgeException,InvalidAmountException, InvalidDaysException {
		
		this.SBamount = amount;
		if(SBamount<0) {
			throw new InvalidAmountException();
			
			
		}
		System.out.println("Select account type: \n1.NRI \n2.Normal");
		int accountChoice = SBScanner.nextInt();
		switch(accountChoice)
		{
			case 1:
				SbInterestRate = 0.06;
				break;
			case 2:
				SbInterestRate = 0.04;
				break;
			default :
				System.out.println("Please choose right account again");
				
		}
		return amount * SbInterestRate;
		
		
	}
	 
}

class FDaccount extends Account{
	double FDinterestRate;
	double FDAmount;
	int noOfDays;
	int ageOfACHolder;
	double General, SCitizen;
	Scanner FDScanner = new Scanner(System.in);
	
	

	@Override
	double calculateIntrest(double amount)
		throws InvalidMonthsException, InvalidAgeException, InvalidAmountException, InvalidDaysException {
		
		this.FDAmount = amount;
		System.out.println("Enter days of FD Holder:-");
		noOfDays = FDScanner.nextInt();
		System.out.println("Enter age of FD  Holder:-");
		ageOfACHolder = FDScanner.nextInt();
		if(amount<0) {
			throw new InvalidAmountException();
			
		}
		if(ageOfACHolder<0) {
			throw new InvalidDaysException();
			
		}
		if (ageOfACHolder < 0) {
			throw new InvalidAgeException();
		}
		if (amount < 10000000) { 
			if (noOfDays >= 7 && noOfDays <= 14)
			{
		
				General = 0.0450;
				SCitizen = 0.0500;
			}
			else if (noOfDays >= 15 && noOfDays <= 29) {
				General = 0.0470;
				SCitizen = 0.0525;
			}
			else if (noOfDays >= 30 && noOfDays <= 45) {
				General = 0.0550;
				SCitizen = 0.0600;
			}
			else if (noOfDays >= 46 && noOfDays <= 60) {
				General = 0.0700;
				SCitizen = 0.0750;
			}
			else if (noOfDays >= 61 && noOfDays <= 184) {
				General = 0.0750;
				SCitizen = 0.0800;
			}
			else if (noOfDays >= 185 && noOfDays <= 365) {
				General = 0.0800;
				SCitizen = 0.0850;
			}
			FDinterestRate = (ageOfACHolder < 50) ? General : SCitizen;
		}
		
		else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				FDinterestRate = 0.065;
			}
			else if (noOfDays >= 15 && noOfDays <= 29) { 
				FDinterestRate = 0.0675;
			}
			else if (noOfDays >= 30 && noOfDays <= 45) {
				FDinterestRate = 0.00675;
			}
			else if (noOfDays >= 45 && noOfDays <= 60) {
				FDinterestRate = 0.080;
			}
			else if (noOfDays >= 61 && noOfDays <= 184) {
				FDinterestRate = 0.0850;
			}
			else if (noOfDays >= 185 && noOfDays <= 365) {
				FDinterestRate = 0.10;
			}
		}
		return FDAmount*FDinterestRate;
	}
}

class InvalidAgeException extends Exception {

}
class InvalidAmountException extends Exception {
	
}
class InvalidDaysException extends Exception {
	
}
class InvalidMonthsException extends Exception {
	
}


public class Main {

	public static void main(String[] args) throws InvalidMonthsException, InvalidAgeException, InvalidDaysException {
		Scanner sc = new Scanner(System.in);
		int IWTC=1;
		while(IWTC==1) {
		System.out.println("SELECT THE OPTIONS :-" + "\n1." + " Interest Calculator-Saving Bank." + " \n2." + " Interest Calculator-Fixed Deposit."
		+ "\n3." + " Interest Calculator-Required Deposit."+"\n4. To exit");
		System.out.println("Please enter your choice :-");
		int choice = sc.nextInt(); 
		
			switch (choice) {
			case 1:
				SBaccount sb=new SBaccount();
				try {
					System.out.println("Enter the Average Saving Bank Amount:-");
					double amount = sc.nextDouble();
					System.out.println("Interest gained is : RS "+sb.calculateIntrest(amount));
				}
				catch(InvalidAmountException e) {
					System.out.println("Exception:Invalid amount");
					
				}break;
			case 2:
				try {
					FDaccount fd = new FDaccount();
					System.out.println("Enter the Fixed Deposit Amount");
					double fAmount = sc.nextDouble();
					System.out.println("Interest gained is: RS " + fd.calculateIntrest(fAmount));
				}
				catch(InvalidAgeException e) {
					System.out.println("Invalid Age Entered");
				}
				catch (InvalidAmountException e) {
					System.out.println("Invalid Amount Entered");
				}
				catch (InvalidDaysException e) {
					System.out.println("Invalid Days Entered");
					
				}break;
			case 3:
				try {
					RDaccount rd = new RDaccount();
					System.out.println("Enter the Required Deposit amount");
					double Ramount = sc.nextDouble();
					System.out.println("Interest gained is: RS " + rd.calculateIntrest(Ramount));
				}
				catch(InvalidAgeException e){
					System.out.println("Invalid Age Entered");
					
					
				}
				catch (InvalidAmountException e) {
					System.out.println("Invalid Amount Entered");
					
				}
				catch (InvalidMonthsException e) {
					System.out.println("Invalid Days Entered");
					
				}break;
			case 4:
			{
				System.exit(0);
				
			}
			
			default :
				System.out.println("Wrong choice , Please Enter valid choice.");
				break;
				//sc.close();
			}
			System.out.println("Enter 1 to continue and 0 to exit");
			IWTC=sc.nextInt();
			if(IWTC==0)
				System.exit(0);
		}
	}
}
		


