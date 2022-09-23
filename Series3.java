package basic;

import java.util.Scanner;
// 1 8 27 64....n
public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        
        for(int i=1;i<=range;i++) {
        	int cube = i*i*i;
      	  if(cube<= range)
        	System.out.print(cube+" ");
        }
       
	}

}
