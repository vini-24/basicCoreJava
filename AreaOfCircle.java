package basic;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r =sc.nextDouble();
		double area = 3.14 *r*r;
		System.out.println(area);
		

	}

}
