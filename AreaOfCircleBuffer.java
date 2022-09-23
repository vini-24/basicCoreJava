package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircleBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius");
		double r=Double.parseDouble(bf.readLine());
		
		double area=3.14*r*r;
		System.out.println("area is "+area);
		

	}

}
