package basic;

import java.util.Scanner;

public class ArrayaOrder {

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Elements");
		int i;
		int j;int temp=0;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<4;i++) {
			for(j=i+1;j<=5;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
	//	for(i=0;i<5;i++) {
	//	System.out.print(a[i]+" ");}
		
		for(i=5;i<9;i++) {
			for( j=i+1;j<=9;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	//	for(i=5;i<9;i++) {
	//		System.out.print(a[i]+" ");
	//	}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
