import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.print("Enter the range 1 to :->");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(int a=1;a<=n;a++) {
		int sum = 0;
				for(int div=1;div<=a/2;div++) {
					if(a%div==0) {
						sum += div;
					}	
				}	
				if(sum == a) 
					System.out.println(a+" is Perfect Number");
					
				else
					System.out.print("");
					
		}		
	}
}