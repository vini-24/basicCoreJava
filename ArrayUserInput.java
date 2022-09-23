package basic;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("Enter "+ size +" elements");
       for( i=0;i<size;i++) {
    	   a[i]= sc.nextInt();   
    	   }
       System.out.println("Array is");
       for(i=0;i<size;i++) {
    	   System.out.println(a[i]);
    	   
       }
	}
	  

}
