package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperationBuffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c = a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		System.out.println(c+"\n"+d+"\n"+e+"\n"+f+"\n"+g);
		
		
		

	}

}
