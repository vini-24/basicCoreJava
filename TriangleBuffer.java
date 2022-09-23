package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TriangleBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values");
		int base = Integer.parseInt(br.readLine());
		int height=Integer.parseInt(br.readLine());
		double area=0.5*base*height;
		System.out.println("area is "+area);
			}
		}


