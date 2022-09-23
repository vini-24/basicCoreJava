package basic;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 value");
        int base = sc.nextInt();
        int  height= sc.nextInt();
        double area;
        area=0.5*base*height;
        System.out.println(area);
        
	}

}
