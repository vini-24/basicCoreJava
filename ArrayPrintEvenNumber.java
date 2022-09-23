package basic;

import java.util.Scanner;

public class ArrayPrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int even;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
	}
		for(i=0;i<size;i++) {
			if(a[i]% 2== 0 ) {
				System.out.println("Even elements");
		       System.out.println(a[i]);
			}
		}

}
}
