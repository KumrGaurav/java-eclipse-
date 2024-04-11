import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Year :->");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n%400==0 || (n%4==0 && n%100!=0))
	    	System.out.println(n+" is Leap year");
	    else
	    	System.out.println(n+" is not leap year");
	
	
	}

}
