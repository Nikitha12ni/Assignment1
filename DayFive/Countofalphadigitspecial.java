package DayFive;

import java.util.Scanner;

public class Countofalphadigitspecial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String string=sc.nextLine();
		int a=0,d=0,s=0;
		for(int i=0;i<string.length();i++) {
			if(Character.isAlphabetic(string.charAt(i)))
			{
				a++;
			}
			else if(Character.isDigit(string.charAt(i)))
			{
				d++;
			}
			else if(!Character.isLetterOrDigit(string.charAt(i)) &&!Character.isWhitespace(string.charAt(i))){
				s++;
			}
		}
		System.out.println("Number of Alphabets"+a);
		System.out.println("Number of Digits"+d);
		System.out.println("Number of Special charcter"+s);
	}

}
