package basic;

import java.util.Scanner;
// 1/2+2/3+3/4+4/5+5/6=?
public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range ");
		int range=scan.nextInt();
		for(i=1;i<=range;i++)
		{
			sum+=i/i+1;
			System.out.print(String.format("%.0f",i)+"/"+String.format("%.0f",i+1));
			if(i<range)
			{
				System.out.print("+");
			}
		}
		System.out.print("="+String.format("%.2f", sum));
	}

}
