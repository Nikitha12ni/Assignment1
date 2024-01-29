package DayThree;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int key;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the arary element\n");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("enter the key element\n");
		key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i]) {
				System.out.println("Key is found");
			}
			else
			{
				System.out.println("Key is not found");
			}
		}
	}
}
