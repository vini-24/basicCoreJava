package basic;

import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter the two numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int c=n1+n2;
		System.out.println("c is"+c);
		System.out.println("Do you want to continue Y/N?");
		 ch=scan.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
	}

}
