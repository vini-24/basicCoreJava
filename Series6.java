package basic;

import java.util.Scanner;
//  1/1+2/2+3/3+4/4+5/5=?
public class Series6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,sum=0;
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the Range");
	     int range=sc.nextInt();
	     
	     for( i=1;i<=range;i++) {
	    	 sum+=i/i;
	    	 System.out.print(String.format("%.0f",i)+"/"+String.format("%.0f", i));
	    	 if(i<range) 
	    		 System.out.print("+");
	     }
	     System.out.print("="+String.format("%.2f", sum));
		}

	
	}


