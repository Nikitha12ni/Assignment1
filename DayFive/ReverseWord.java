package DayFive;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		String[] extract=extractword(str);
		//System.out.print("Array of Strings are"+Arrays.toString(extract));
		String rev=reversedd(extract);  
		System.out.print("Strings after revsersing "+ rev);
	}

	private static String reversedd(String[] extract) {
	String reve="";
	for(int i=0;i<extract.length;i++)
	{
	reve=reve+" "+reverseword(extract[i]);
		}
		return reve;
	}

	private static String reverseword(String ch) {
		String re="";
		
	    for(int i=0;i<ch.length();i++)
	    {
	    	re=ch.charAt(i)+re;
	    	 System.out.println(re);
	    }
	    System.out.println(re);
		return re;
	}

	private static String[] extractword(String str) {
		
		str=str.replaceAll("[^a-zA-Z]", " ");
		String[] array=str.split("\\s+");
				//str.replaceAll("[^a-zA-Z \n]", " ").
		//array=;
		System.out.print(array.length);
		
		return array;
	}

}
