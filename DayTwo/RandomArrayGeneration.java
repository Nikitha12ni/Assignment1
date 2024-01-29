package DayTwo;
import java.util.Scanner;
public class RandomArrayGeneration {
	public static void  main(String[] args) {
		int size;
		int j=0;
		Scanner sc=new Scanner(System.in);
		do {
			size=sc.nextInt();
			j++;
		}while(size>11&&j<3);
		if(size>11)
		{
			System.out.print("Array is invalid");
		}
		else
		{
			int[] n=new int[size];
			for(int i=0;i<size;i++)
			{
				n[i]=(int) ((Math.random()*500)%500+100);
			}
			for(int i=0;i<size;i++)
			{
				System.out.println(n[i]);
			}
		}
		
	}
}
