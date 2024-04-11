import java.io.*;
import java.util.*;
public class Average {

	public static void main(String[] args)
	{
		System.out.print("Enter ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		int c = sc.nextInt(); 
			
		int average = (a+b+c)/3;
		System.out.println(average);
		
	}

}
