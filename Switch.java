import java.util.*;
public class Switch {

	public static void main(String[] args) 
	{
		 int count=0;
         int lower=100;
         int upper = 999;
         
         for(int i=upper;i>=lower;i--){
               if(isPrime(i)){
                     count += 1;
                }
         }
         System.out.println((double)count/(upper-lower+1));
		
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
