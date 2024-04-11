import java.util.*;

public class Abbreviate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "George Bernal Show";
		String[] namePath = name.split(" ");
		if (namePath.length==1)
		{
			System.out.println(namePath[0]);
			
		}
		else
		{
			for(int i=0;i<namePath.length-1;i++)
			{
				System.out.print(namePath[i].charAt(0)+" ");
				
			}
			System.out.println(namePath[namePath.length-1]);
		}
		
	}

}
