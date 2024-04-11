import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of terms of series:->");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,c,x=0,y=1;
		System.out.println("The Fibonaci series of " +n +"terms is");
		for(c=0;c<n;c++)
		{
			if (c<=1)
				a=c;
			else
			{
				a=x+y;
				x=y;
				y=a;
			}
			System.out.print(a+",");
		}
		//System.out.print("backspace.");
		
		
		
		
	}

}
