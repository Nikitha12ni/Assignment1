package DayFive;

import java.util.Scanner;

public class ReverseCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String str=sc.nextLine();
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				rev=rev+Character.toUpperCase(str.charAt(i));
				
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
			rev=rev+Character.toLowerCase(str.charAt(i));
			
			}
		}
		System.out.print("Reverse cased string is "+rev);
	}

}
