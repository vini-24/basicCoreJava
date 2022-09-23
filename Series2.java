package basic;

import java.util.Scanner;
// 1 4 9 16..n
public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        
        for(int i=1;i<=range;i++) {
        	 
        	System.out.print(i*i+" ");
        	  
        }
	}

}
