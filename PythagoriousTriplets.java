import java.lang.Math;
import java.util.*;
public class PythagoriousTriplets {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=100;i++)
		{
			for(j=i;j<=100;j++)
			{
				for(k=j;k<=100;k++)
				{
					if(Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2))
					{
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
			
		}
		
	}

}
