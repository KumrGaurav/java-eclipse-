import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number:->");
		Scanner sc = new Scanner(System.in);
		long  n = sc.nextLong();
		long a,fact;
		fact=1;
		for(a=n;a>=1;a--)
			fact=fact*a;
		System.out.println("Factorial of "+n+" = "+fact);
		
	}

}
