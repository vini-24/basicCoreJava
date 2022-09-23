package basic;

import java.util.Scanner;
// 1 9 25 49 ...n
public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Range");
         int range=sc.nextInt();
         
         for(int i=1;i<=range;i++) {
        	 if(i%2 == 1) { 
        		int square = i*i;
           	      if(square<= range)
        		  System.out.print(square+" ");  
        	 }
         }
	}

}
