package DayFive;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String str=sc.nextLine();
		String[] extract=extractword(str);
		System.out.print("Array of Strings are"+Arrays.toString(extract));
		
	}

	private static String[] extractword(String str) {
		String[] array=str.replaceAll("[^a-zA-Z \n]", " ").split("\\s+ ");
		
		return array;
	}

}
