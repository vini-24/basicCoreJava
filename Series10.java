package basic;

import java.util.Scanner;

public class Series10 {
// 1-2 + 3-4 + 5-6 +....n =?
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		int sum=0;
		int a[]=new int[range];
		 for(int i=1;i<a.length;i=i+2)
		 { 
			 sum+=i-(i+1);
			
			 System.out.print(i+"-"+(i+1));
			 if(i<range-1)
			 {
				 System.out.print(" + ");
			 }
		 }
		 System.out.print("="+sum);
		 
	}

}
