package DayThree;
import java.util.Scanner;
public class ArrayaOperations {
	public static void main(String[] args) {
		//int a[]={1,2,3,4,5};//static
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];	
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element form of array"+a[i]);
		}
	}
}
