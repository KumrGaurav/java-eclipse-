import java.util.*;
public class Loop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("Enter any Number:-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Table of:-"+n);
		//System.out.println(n);
		for(int i=1;i<11;i++)
			System.out.println(i*n);
			
	}

}
