import java.util.*;
import java.io.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number:->");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a,b,s;
		s=0;
		for(a=n;a>0;a=a/10)
		{
			b=a%10;
			s=(s*10)+b;
		}
		System.out.print("Reverse of " +n+"="+s);
		
	}

}
