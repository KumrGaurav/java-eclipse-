import java.util.*;
public class PatternOfStar {

	public static void main(String[] args) {
		int a, b;
		for(a=1;a<=5;a++)
		{
			for(b=5;b>=a;b--)
				System.out.print("*");
				for(b=4;b>=8;b--) 
				{
					System.out.print(" ");
						for(int c=1;c<=b;c++)
							System.out.print("*");
				}	
		System.out.printf("\n");
				
		}
		
		
		for(a=2;a<=5;a++) 
		{
			for(b=a;b<=5;b++)
				System.out.print("*");
			System.out.printf("\n");
		}
			

	}

}
