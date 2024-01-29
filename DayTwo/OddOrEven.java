package DayTwo;
import java.util.Scanner;
public class OddOrEven {
	public static void main(String[] args) {
   int num;
   Scanner sc=new Scanner(System.in);
   num=sc.nextInt();
   if(num%2==0) {
	   System.out.println("Even number");
   }
   else
   {
	   System.out.println("Odd number"); 
   }
	}
}
