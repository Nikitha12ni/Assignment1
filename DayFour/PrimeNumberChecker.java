package DayFour;
import java.util.Scanner;
public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in );
		System.out.println("Enter the Size of Array ");
		int n=sc.nextInt();
		System.out.println("Enter the Lower Limit ");
		int lowerlimit=sc.nextInt();
		System.out.println("Enter the Higher Limit ");
		int higherlimit=sc.nextInt();
		int[] array=RandomArray(n,lowerlimit,higherlimit);
		System.out.println("Array element are ");	
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");	
		}
		int countofprime=count(array);
		System.out.println("\nCount of prime number in array are "+countofprime);
		int[] nonprimenumber=nonprimechecker(array);
		System.out.println("Nonprime number in array are ");
		for(int i=0;i<nonprimenumber.length;i++)
		{
			System.out.print(nonprimenumber[i]+"\t");	
		}

	}
static int[] RandomArray(int n,int lowerlimit,int higherlimit)
{
	int[] array=new int[n];
	for(int i=0;i<n;i++)
	{
		array[i]=(int) ((Math.random()*(higherlimit-lowerlimit+1)%(higherlimit-lowerlimit+1))+lowerlimit);
	}
	return array;
}
static boolean  isprime(int num) {
	if(num<=1)
	{
		return false;
	}
	else
	{
		for(int i=2;i<num;i++)
		{
			if(i%num==0)
			{
				return false;
			}
		}
	}
	return true;
}
static int count(int[] array)
{
	int c=0;
	for(int i=0;i<array.length;i++)
	{
		if(isprime(array[i]))
		{
			c++;
		}
	}
	return c;
}
static int[] nonprimechecker(int[] array)
{
	int[] nonprime=new int[array.length-count(array)];
	int i=0;
	for(int arr:array) {
		if(!isprime(arr))
		{
		nonprime[i++]=arr;	
		}
	}
	return nonprime;
}
}
