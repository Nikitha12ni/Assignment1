package DayFour;

import java.util.Scanner;

public class DecimalToBimnary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal digit");
		int digit=sc.nextInt();
		String binary=Decima_To_Binary(digit);
		System.out.print("The binary value is "+binary);
	}

	private static String Decima_To_Binary(int digit) {
		int num=digit;
		String str="";
		int a=0;
		while(num!=0)
		{
			a=num%2;
			str=Integer.toString(a)+str;
			num=num/2;
		}
	
		return str;
	}

}
