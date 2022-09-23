package basic;

import java.util.Scanner;

public class ArrayAvergeOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum =0;
		int sum1=0;
		int oCount=0;
		int eCount=0;
		int oAvg=0;
		int eAvg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the "+ size+ " elements");
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
	}
		
		for(i=0;i<size;i++) {
			if(a[i]%2==0) {
				++eCount;
				sum+=a[i];
			}
			else {
				++oCount;
				sum1+=a[i];
			}
	}
		eAvg=sum/eCount;
		oAvg=sum1/oCount;
		System.out.println("Average of Odd number is "+oAvg);
		System.out.println("Average of Even number is "+eAvg);
		

}
}