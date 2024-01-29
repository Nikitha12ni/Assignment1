package DayFour;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.print("Enter the series count");
		int n=sc.nextInt();
		int[] fibseries=fibonocciseries(n);
		System.out.println("Generated series are ");
		for(int i=0;i<n;i++) {
			System.out.print(fibseries[i]+"\t");
		}
		System.out.print("\n");
		System.out.println("Five eleement in one line is");
		generateseries5(fibseries);
	}
	static int[] fibonocciseries(int n) {
		int[] array=new int[n];
		array[0]=0;
		array[1]=1;
		for(int i=2;i<n;i++)
		{
			array[i]=array[i-2]+array[i-1];
		}
		return array;
	}
	static void generateseries5(int[] fibseries) {
		int j=0;
			for(int i=0;i<fibseries.length;i++)
			{
				System.out.print(fibseries[i]+",");
				j++;				if(j==5)
				{
					System.out.print("\n");
					j=0;
				}
			}
	}
}
