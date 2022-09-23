package basic;

import java.util.Scanner;
// 1 3 5 7 ...n
public class Series1 {

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Range");
         int range=sc.nextInt();
         
         for(int i=1;i<=range;i++) {
        	 if(i%2 == 1) {       //for odd numbers
        		 System.out.print(i+" ");  
        	 }
         }
	
	
	}

}
