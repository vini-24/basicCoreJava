package basic;

import java.util.Scanner;

public class Series11 {
// 1/1! + 2/2! +.....+n/n!=?
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range");
	    int n=sc.nextInt();
	    double sum=0;
	    int fact=1;
	    for(int i=1;i<=n;i++)
	    { 
	    	fact=fact*i;
	    	sum=i/fact;
	    	
	    	System.out.print(i+"/"+i+"!");
	    	if(i<n)
	    	{
	    		System.out.print("+ ");
	    	}
	    	
	    }
	    System.out.println("= "+sum);
	}

}
