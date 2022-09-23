package basic;

import java.util.Scanner;

public class ArrayPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int pCount=0;
		int nCount=0;
		int zCount=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
	}  
		for(i=0;i<size;i++) {
			if(a[i]>0) 
				++pCount;
			
			else if(a[i]<0) 
				++nCount;
			
			else
				++zCount;
		}
		System.out.println("Frequency of Positive "+pCount);
		System.out.println("Frequency of Negative "+nCount);
		System.out.println("Frequency of Zero "+zCount);
		
	}

}
