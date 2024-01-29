package DayFive;

import java.util.Scanner;

public class RemoveOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=sc.nextLine();
		System.out.println("Enter the string or chaarcter to remove");
		String substr=sc.nextLine();
		string=string.replaceAll(substr, "");
		
		System.out.println("Final string is"+string);
	}

}
