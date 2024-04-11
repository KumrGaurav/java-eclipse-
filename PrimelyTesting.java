import java.util.*;
//import java.lang.Math;

public class PrimelyTesting {

	public static void main(String[] args) {
		System.out.println("Enter any number to check it Prime or Not :->");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		boolean isPrime = true;
		for(int i=2;i<=Math.sqrt(n);i++) //time complexity minimum;
		{
			if(n%2==0)
			{
				isPrime = false;
				break;
				 
			}
		}
		if(isPrime==true)
		{
			System.out.println(n+" is a Prime number");
			
		}
		else
		{
			System.out.println(n+" is Not a Prime number");
		}
			
	}

}
