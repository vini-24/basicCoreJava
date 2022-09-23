package basic;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First value ");
		int a=scan.nextInt();
		System.out.println("Enter the Second value");
		int b=scan.nextInt();
		
		int add = a+b;
		int subtract=a-b;
		int multiply=a*b;
		int division=a/b;
		int modulus=a%b;
		
		System.out.println("Addition of two Number is "+ add);
		System.out.println("Subraction of two Number is "+ subtract);
		System.out.println("Multiplication of two Number is "+ multiply);
		System.out.println("Division of two Number is "+ division);
		System.out.println("Modulus of two Number is "+ modulus);
		

	}

}
