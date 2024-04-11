import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        sc.close();
        
        for(int i=0;i<n;i++){
        	
        	int counter =1;
        	int temp=arr[i];
        	arr[i]=-1;
            for(int j=0;j<n;j++) {
            	if(temp ==arr[j] && temp!=-1){
                    counter++;
                    arr[j]=-1;
            }
            }
            if(temp!=-1)
            	System.out.println(counter);  
                    
          
            
        }
        
        
    }
}
