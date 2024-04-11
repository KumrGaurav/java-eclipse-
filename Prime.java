import java.util.*;
public class Prime{

	public static void main(String[] args) {
		System.out.println("Enter any number:->");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,c;
		c=0;
		for(a=1;a<=n;a++)
		{ 
			if(n%a==0)
				c++;
		}
		if(c==2) 
		{
			System.out.println(n+"  is prime number");
		}
		else
			System.out.println("Not Prime");
	}

}
