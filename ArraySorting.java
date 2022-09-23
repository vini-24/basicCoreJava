package basic;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		int i;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
	}
        
         for( i=0;i<arr.length-1;i++) {
        	 for(int j=i+1;j<arr.length;j++) {
        	 if(arr[i]>arr[j]) {
        	 temp=arr[i];
        	 arr[i]=arr[j];
        	 arr[j]=temp;}
         }
         }
         System.out.println("The Sorted Arry is ");
         for( i=0;i<arr.length;i++) {
        
         System.out.print(arr[i]+ " ");
        
         }
         
             
 
             
    	}
	}


