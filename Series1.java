import java.util.*;
import java.io.*;
public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of terms of series 1+1/2+1/3.....:->");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		System.out.print("1+");
		double s=1;
		for (a=2;a<=n;a++)
		{
			System.out.print("1/"+a+"+");
			s= s+(double)(1)/2;
		}
		System.out.print("="+s);
			
			 
		
		}

}
