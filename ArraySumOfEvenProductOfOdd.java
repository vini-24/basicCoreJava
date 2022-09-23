package basic;

import java.util.Scanner;

public class ArraySumOfEvenProductOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum =0;
		int product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
	}
		System.out.println(" ");
		for(i=0;i<size;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
			else {
				product*=a[i];
		}
		}
		System.out.println("Sum of Even number "+sum);
		System.out.println("Product of Odd number "+product);
	
		}
	}

