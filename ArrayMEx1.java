package basic;

import java.util.Scanner;

public class ArrayMEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the row and column size");
        int row=scan.nextInt();
        int column=scan.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter the matrices");
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		arr[i][j]=scan.nextInt();        	}
        }
        
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println(" ");
	}
	}

}
