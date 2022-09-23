package basic;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
	
      Scanner scan =new Scanner(System.in);
      System.out.println("Enter the size");
      int size=scan.nextInt();
      
      int a[]=new int[size];
      System.out.println("Enter the "+size+" elements");
      for(i=0;i<a.length;i++) {
    	  a[i]=scan.nextInt();
      }
      int max=a[0];
      int min=a[0];
      for(i=1;i<a.length;i++) {
    	  if(a[i]>max)
    		   max=a[i]; 
    	  if(a[i]<min)
   		   min=a[i]; 
	}
      System.out.println("The max element is "+max);
  
      System.out.println("The min element is "+min);
}
}
