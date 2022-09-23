package basic;

import java.util.Scanner;

public class ArraySumOfElements {

	public static void main(String[] args) {
		int i;
		int sum =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The given array is ");
		for(i=0;i<size;i++) {
		 
		 sum+=a[i];
		 
		 System.out.print(a[i]+" ");
		}
		System.out.println("\nsum is "+sum);
		
		

	}

}
