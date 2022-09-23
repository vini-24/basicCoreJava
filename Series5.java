package basic;

import java.util.Scanner;
//  1/1+1/2+1/3+....+1/5=?
public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,sum=0;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the Range");
     int range=sc.nextInt();
     
     for( i=1;i<=range;i++) {
    	 sum+=1/i;
    	 System.out.print("1/"+String.format("%.0f", i));
    	 if(i<range) 
    		 System.out.print("+");
     }
     System.out.print("="+String.format("%.2f", sum));
	}

}
