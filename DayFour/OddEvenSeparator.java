package DayFour;

import java.util.Scanner;

public class OddEvenSeparator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter series length ");
		int n=sc.nextInt();
		int[] fibser=fibonocciseries(n);
		int[] odd=oddArray(fibser);
		int[] even=evenArray(fibser);
		System.out.print("Fibonacci Series are " );
		for(int i=0;i<n;i++) {
			System.out.print(fibser[i]+"\t");
		}
		System.out.print("\nOdd number in series are ");
		for(int i=0;i<odd.length;i++) {
			System.out.print(odd[i]+"\t");
		}
		System.out.print("\nEvennumber in Series are ");
		for(int i=0;i<even.length;i++) {
			System.out.print(even[i]+"\t");
		}
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
	static boolean isodd(int num)
	{
		if(num%2!=0)
		{
			return true;
		}
		return false;
	}
	static int[] oddArray(int[] fib)
	{
		int[] oA=new int[oddcount(fib)];
		int i=0;
		for(int f:fib)
		{
			if(isodd(f))
			{
	           oA[i++]=f;
			}
		}
		return oA;
	}
	static int[] evenArray(int[] fib)
	{
		int[] eA=new int[fib.length-oddcount(fib)];
		int i=0;
		for(int f:fib)
		{
			if(!isodd(f))
			{
	           eA[i++]=f;
			}
		}
		return eA;
	}
	static int oddcount(int[] fib) {
		int c=0;
		for(int f:fib) {
			if(f%2!=0)
			{
				c++;
			}
		}
		return c;
	}
}