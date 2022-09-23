package basic;

public class ArrayRollNo {

	public static void main(String[] args) {
		int rollNo[]= {1,2,3,4,5};
		int marks[]= {65,58,89,42,76};
		int i,j;
		int temp=0;
		int temp1=0;
		for(i=0;i<marks.length-1;i++)
		{
			for(j=i+1;j<marks.length;j++)
			{
				if(marks[i]<marks[j]) {
					
				temp=marks[i];
				marks[i]=marks[j];
				marks[j]=temp;
				
				temp1=rollNo[i];
				rollNo[i]=rollNo[j];
				rollNo[j]=temp1;
				
				}
			}
		}
		System.out.print("RollNo: ");
		for(i=0;i<rollNo.length;i++) {
		
			System.out.print(rollNo[i]+"\t");
		}
		System.out.println("");
		
		System.out.print("Marks: ");
		
		for(i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"\t");
		}

	}

}
