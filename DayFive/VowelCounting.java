package DayFive;
import java.util.Scanner;
public class VowelCounting {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the string");
    	String str=sc.nextLine();
    	int vowel=vowelCount(str);
    	System.out.println("Vowel count is "+vowel);
    	int[][] vowelcount=eachofvowelCount(str);
    	System.out.println("Vowel count is "+vowel);
    	displayvowelcount(vowelcount);
	}
	private static void displayvowelcount(int[][] vowelcount) {
		System.out.println("Vowel count is ");
		for (int i = 0; i < vowelcount.length; i++) {
            char[] vowel = {'a','e','i','o','u'};
            int count = vowelcount[i][1];
            System.out.println("'" + vowel[i] + "': " + count + " occurrences");
        }
	}
	private static int[][] eachofvowelCount(String str) {
		int[][] array=new int[5][2];
		for(int i=0;i<array.length;i++)
		{
			array[i][0]=i;
			array[i][1]=0;
		}
		str=str.toLowerCase();
		
		for (char ch : str.toCharArray()) {
			int index=0;
            switch (ch) {
                case 'a':  index=0;
                           break;
                case 'e':   index=1;
                              break;
                case 'i':   index=2;
                            break;
                case 'o':    index=3;
                             break;
                case 'u': index=4;
                              break;
            }
            array[index][1]++; 
        }
		return array;
	}
	private static int vowelCount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
}
